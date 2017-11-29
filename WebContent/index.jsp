<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
  <!-- Standard Meta -->
  <meta charset="utf-8" />
  <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />
  <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0">

  <!-- Site Properties -->
  <title>游泳世界</title>
  <link rel="stylesheet" type="text/css" href="dist/components/reset.css">
  <link rel="stylesheet" type="text/css" href="dist/components/site.css">

  <link rel="stylesheet" type="text/css" href="dist/components/container.css">
  <link rel="stylesheet" type="text/css" href="dist/components/grid.css">
  <link rel="stylesheet" type="text/css" href="dist/components/header.css">
  <link rel="stylesheet" type="text/css" href="dist/components/image.css">
  <link rel="stylesheet" type="text/css" href="dist/components/menu.css">

  <link rel="stylesheet" type="text/css" href="dist/components/divider.css">
  <link rel="stylesheet" type="text/css" href="dist/components/dropdown.css">
  <link rel="stylesheet" type="text/css" href="dist/components/segment.css">
  <link rel="stylesheet" type="text/css" href="dist/components/button.css">
  <link rel="stylesheet" type="text/css" href="dist/components/list.css">
  <link rel="stylesheet" type="text/css" href="dist/components/icon.css">
  <link rel="stylesheet" type="text/css" href="dist/components/sidebar.css">
  <link rel="stylesheet" type="text/css" href="dist/components/transition.css">

  <style type="text/css">

    .hidden.menu {
      display: none;
    }

    .masthead.segment {
      min-height: 700px;
      padding: 1em 0em;
    }
    .masthead .logo.item img {
      margin-right: 1em;
    }
    .masthead .ui.menu .ui.button {
      margin-left: 0.5em;
    }
    .masthead h1.ui.header {
      margin-top: 3em;
      margin-bottom: 0em;
      font-size: 4em;
      font-weight: normal;
    }
    .masthead h2 {
      font-size: 1.7em;
      font-weight: normal;
    }

    .ui.vertical.stripe {
      padding: 8em 0em;
    }
    .ui.vertical.stripe h3 {
      font-size: 2em;
    }
    .ui.vertical.stripe .button + h3,
    .ui.vertical.stripe p + h3 {
      margin-top: 3em;
    }
    .ui.vertical.stripe .floated.image {
      clear: both;
    }
    .ui.vertical.stripe p {
      font-size: 1.33em;
    }
    .ui.vertical.stripe .horizontal.divider {
      margin: 3em 0em;
    }

    .quote.stripe.segment {
      padding: 0em;
    }
    .quote.stripe.segment .grid .column {
      padding-top: 5em;
      padding-bottom: 5em;
    }

    .footer.segment {
      padding: 5em 0em;
    }

    .secondary.pointing.menu .toc.item {
      display: none;
    }

    @media only screen and (max-width: 700px) {
      .ui.fixed.menu {
        display: none !important;
      }
      .secondary.pointing.menu .item,
      .secondary.pointing.menu .menu {
        display: none;
      }
      .secondary.pointing.menu .toc.item {
        display: block;
      }
      .masthead.segment {
        min-height: 350px;
      }
      .masthead h1.ui.header {
        font-size: 2em;
        margin-top: 1.5em;
      }
      .masthead h2 {
        margin-top: 0.5em;
        font-size: 1.5em;
      }
    }


  </style>

  <script src="js/jquery.min.js"></script>
  <script src="dist/components/visibility.js"></script>
  <script src="dist/components/sidebar.js"></script>
  <script src="dist/components/transition.js"></script>
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
</head>
<body>

<!-- Following Menu -->
<jsp:include page="header.jsp"></jsp:include>

<!-- Page Contents -->
<div class="pusher">
  <div class="ui inverted vertical masthead center aligned segment" style="background:url(image/index/SwimIndex1.jpg) no-repeat ;background-size: cover;">

    <div class="ui container">
      <div class="ui large secondary inverted pointing menu">
        <a class="toc item">
          <i class="sidebar icon"></i>
        </a>
        <a class="active item" href="index.jsp">主页</a>
        <a class="item">课程</a>
        <a class="item">讨论区</a>
        <a class="item">精彩文章</a>
        <div class="right item">
          <a class="ui inverted button" href="Login.jsp">登录</a>
          <a class="ui inverted button" href="register.jsp">注册</a>
        </div>
      </div>
    </div>

    <div class="ui text container">
      <h1 class="ui inverted header">
        	游泳没你想得那么难！
      </h1>
      <h2>Do whatever you want when you want to.</h2>
      <div class="ui huge primary button">开始学习</div>
    </div>

  </div>

  <div class="ui vertical stripe segment">
    <div class="ui middle aligned stackable grid container">
      <div class="row">
        <div class="eight wide column">
          <h3 class="ui header">为什么要学习游泳？</h3>
          <p>游泳最容易锻炼身体，游泳锻炼是克服水的阻力而不是克服重力，肌肉和关节不易受伤。 游泳时水的作用使肢体血液易于回流心脏，使心率加快。长期游泳会使心脏运动性增大，收缩有力。 游泳能改善体温调节机能，预防感冒。</p>
          <h3 class="ui header">游泳有几种泳姿？</h3>
          <p>4种：蛙泳     自由泳     仰泳       蝶泳.</p>
        </div>
        <div class="six wide right floated column">
          <img src="image/index/dieyong.jpg" class="ui large bordered rounded image">
        </div>
      </div>
      <div class="row">
        <div class="center aligned column">
          <a class="ui huge button">前往讨论区</a>
        </div>
      </div>
    </div>
  </div>

 	
  <div class="ui vertical stripe quote segment">
    <div class="ui equal width stackable internally celled grid">
      <div class="center aligned row">
        <div class="column">
          <h3>生命需要运动</h3>
          <p>That is what they all say about us</p>
        </div>
        <div class="column">
          <h3>"游泳是同大自然作斗争的一种运动，你们应该到大江大海去锻炼。"</h3>
          <p>
            <b>——毛泽东</b> 
          </p>
        </div>
      </div>
    </div>
  </div>
	<h4 class="ui horizontal header divider">
        <a href="#">精彩文章</a>
      </h4>
  <div class="ui vertical stripe segment">
    <div class="ui text container">
      <h3 class="ui header">如何选择游泳用具？</h3>
      <p> 一、合身的游泳衣裤：游泳衣裤必须合身。如果太大，在游泳时容易兜水，以致加大身体负重和阻力，影响游泳动作。因此游泳衣裤要以穿在身上感到舒适为宜。至于质量，中老年人应选择纯毛或棉毛制品，以深色为宜。年轻人可选择海滩式的尼龙......   </p>
      <a class="ui large button">查看全文</a>
     
      <h3 class="ui header">夏天游泳应该注意什么？</h3>
      <p>·饭后不宜游泳。·有开放性伤口、皮肤病、眼疾不宜游泳。·感冒、生病、身体不适或虚弱不宜游泳。·雷雨的天候不宜游泳。    ·水温太低、太凉不宜游泳.....</p>
      <a class="ui large button">查看全文</a>
    </div>
  </div>


<jsp:include page="footer.jsp"></jsp:include>
</div>

</body>

</html>