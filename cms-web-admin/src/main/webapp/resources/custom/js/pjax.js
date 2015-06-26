/**
 * @author Chen Yujian
 * 2015-06-12 13:47:15
 * pushState + Ajax
 */

$.fn.extend({
	pjax: function(option) {
		var hash = window.location.hash;
		if(hash) {
			hash = hash.split('#')[1];
		} else {
			hash = option.defaultHash;
		}
		
		$(option.container).load(hash);
		
		window.addEventListener('popstate', function(event) {
			if(event.state) {
				var state = event.state;
				var title = state.title;
				var url = state.url;
				document.title = title;
				$(option.container).load(url);
			}
		}, false);
		
		return this.each(function() {
			var html = '', data = option.data;
			for(var i=0, length = data.length; i<length; i++) {
				var active = '';
				if(hash === data[i].url) {
					active = ' class="active"';
				}
				html += '<li'+active+'><a href="'+data[i].url+'" title="'+data[i].text+'">'+data[i].text+'</a></li>'
			}
			$(this).html(html);
			
			var _this = $(this);
			
			$(this).children('li').on('click', 'a', function(event) {
				event.preventDefault(); //阻止默认的跳转动作
	    		var url = $(this).attr('href');
	    		var title = $(this).attr('title');
	    		document.title = title;
	    		if(window.history.pushState) {
	    			url = '#'+url;
	    			window.history.pushState({url: url, title: title}, title, url);
	    			$(option.container).load(url);
	    		} else {
	    			alert("请升级到现代浏览器");
	    		}
	    		_this.children('li.active').removeClass('active');
	    		$(this).parent('li').addClass('active');
			});
		});
	}
});