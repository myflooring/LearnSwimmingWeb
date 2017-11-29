<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

 <script>
  $(document)
    .ready(function() {

      // fix menu when passed
      $('.masthead')
        .visibility({
          once: false,
          onBottomPassed: function() {
            $('.fixed.menu').transition('fade in');
          },
          onBottomPassedReverse: function() {
            $('.fixed.menu').transition('fade out');
          }
        })
      ;

      // create sidebar and attach to menu open
      $('.ui.sidebar')
        .sidebar('attach events', '.toc.item')
      ;

    })
  ;
  </script>

<div class="ui large top fixed hidden menu">
  <div class="ui container">
    <a class="active item" href="index.jsp">主页</a>
    <a class="item">课程</a>
    <a class="item">讨论区</a>
    <a class="item">精彩文章</a>
    <div class="right menu">
      <div class="item">
        <a class="ui button" href="Login.jsp">登陆</a>
      </div>
      <div class="item">
        <a class="ui primary button" href="register.jsp">注册</a>
      </div>
    </div>
  </div>
</div>

<!-- Sidebar Menu -->
<div class="ui vertical inverted sidebar menu">
  <a class="active item" href="index.jsp">主页</a>
  <a class="item">课程</a>
  <a class="item">讨论区</a>
  <a class="item">精彩文章</a>
  <a class="item" href="Login.jsp">登录</a>
  <a class="item" href="register.jsp">注册</a>
</div>

