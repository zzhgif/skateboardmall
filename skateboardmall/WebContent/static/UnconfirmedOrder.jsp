<%@page import="com.skateboardmall.service.impl.RecInfoService"%>
<%@page import="com.skateboardmall.service.IRecInfoService"%>
<%@page import="com.skateboardmall.bean.OrderInfo"%>
<%@page import="com.skateboardmall.service.impl.OrderService"%>
<%@page import="com.skateboardmall.service.IOrderInfoService"%>
<%@page import="com.skateboardmall.service.impl.SkiService"%>
<%@page import="com.skateboardmall.service.ISkiService"%>
<%@page import="com.skateboardmall.bean.OrdsInfo"%>
<%@page import="com.skateboardmall.service.impl.OrdsInfoService"%>
<%@page import="com.skateboardmall.service.IOrdsInfoService"%>
<%@page import="com.skateboardmall.bean.UserInfo"%>
<%@page import="java.util.List"%>
<%@page import="com.skateboardmall.service.impl.UserInfoService"%>
<%@page import="com.skateboardmall.service.IUserInfoService"%>
<%@page import="com.skateboardmall.service.IAdminInfoService"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<meta name="description" content="">
	<meta name="author" content="Dashboard">
	<meta name="keyword" content="Dashboard, Bootstrap, Admin, Template, Theme, Responsive, Fluid, Retina">
	<title>Dashio - Bootstrap Admin Template</title>
	
	<!-- Favicons -->
	<link href="img/favicon.png" rel="icon">
	<link href="img/apple-touch-icon.png" rel="apple-touch-icon">
	
	<!-- Bootstrap core CSS -->
	<link href="lib/bootstrap/css/bootstrap.min.css" rel="stylesheet">
	<!--external css-->
	<link href="lib/font-awesome/css/font-awesome.css" rel="stylesheet" />
	<link href="lib/advanced-datatable/css/demo_page.css" rel="stylesheet" />
	<link href="lib/advanced-datatable/css/demo_table.css" rel="stylesheet" />
	<link rel="stylesheet" href="lib/advanced-datatable/css/DT_bootstrap.css" />
	<!-- Custom styles for this template -->
	<link href="css/style.css" rel="stylesheet">
	<link href="css/style-responsive.css" rel="stylesheet">
	<title>Insert title here</title>
</head>
<body>
	<section id="container">
    <!-- **********************************************************************************************************************************************************
        TOP BAR CONTENT & NOTIFICATIONS
        *********************************************************************************************************************************************************** -->
    <!--header start-->
    <header class="header black-bg">
      <div class="sidebar-toggle-box">
        <div class="fa fa-bars tooltips" data-placement="right" data-original-title="Toggle Navigation"></div>
      </div>
      <!--logo start-->
      <a href="index.html" class="logo"><b>DASH<span>IO</span></b></a>
      <!--logo end-->
      <div class="nav notify-row" id="top_menu">
        <!--  notification start -->
        <ul class="nav top-menu">
          <!-- settings start -->
          <li class="dropdown">
            <a data-toggle="dropdown" class="dropdown-toggle" href="index.html#">
              <i class="fa fa-tasks"></i>
              <span class="badge bg-theme">4</span>
              </a>
            <ul class="dropdown-menu extended tasks-bar">
              <div class="notify-arrow notify-arrow-green"></div>
              <li>
                <p class="green">You have 4 pending tasks</p>
              </li>
              <li>
                <a href="index.html#">
                  <div class="task-info">
                    <div class="desc">Dashio Admin Panel</div>
                    <div class="percent">40%</div>
                  </div>
                  <div class="progress progress-striped">
                    <div class="progress-bar progress-bar-success" role="progressbar" aria-valuenow="40" aria-valuemin="0" aria-valuemax="100" style="width: 40%">
                      <span class="sr-only">40% Complete (success)</span>
                    </div>
                  </div>
                </a>
              </li>
              <li>
                <a href="index.html#">
                  <div class="task-info">
                    <div class="desc">Database Update</div>
                    <div class="percent">60%</div>
                  </div>
                  <div class="progress progress-striped">
                    <div class="progress-bar progress-bar-warning" role="progressbar" aria-valuenow="60" aria-valuemin="0" aria-valuemax="100" style="width: 60%">
                      <span class="sr-only">60% Complete (warning)</span>
                    </div>
                  </div>
                </a>
              </li>
              <li>
                <a href="index.html#">
                  <div class="task-info">
                    <div class="desc">Product Development</div>
                    <div class="percent">80%</div>
                  </div>
                  <div class="progress progress-striped">
                    <div class="progress-bar progress-bar-info" role="progressbar" aria-valuenow="80" aria-valuemin="0" aria-valuemax="100" style="width: 80%">
                      <span class="sr-only">80% Complete</span>
                    </div>
                  </div>
                </a>
              </li>
              <li>
                <a href="index.html#">
                  <div class="task-info">
                    <div class="desc">Payments Sent</div>
                    <div class="percent">70%</div>
                  </div>
                  <div class="progress progress-striped">
                    <div class="progress-bar progress-bar-danger" role="progressbar" aria-valuenow="70" aria-valuemin="0" aria-valuemax="100" style="width: 70%">
                      <span class="sr-only">70% Complete (Important)</span>
                    </div>
                  </div>
                </a>
              </li>
              <li class="external">
                <a href="#">See All Tasks</a>
              </li>
            </ul>
          </li>
          <!-- settings end -->
          <!-- inbox dropdown start-->
          <li id="header_inbox_bar" class="dropdown">
            <a data-toggle="dropdown" class="dropdown-toggle" href="index.html#">
              <i class="fa fa-envelope-o"></i>
              <span class="badge bg-theme">5</span>
              </a>
            <ul class="dropdown-menu extended inbox">
              <div class="notify-arrow notify-arrow-green"></div>
              <li>
                <p class="green">You have 5 new messages</p>
              </li>
              <li>
                <a href="index.html#">
                  <span class="photo"><img alt="avatar" src="img/ui-zac.jpg"></span>
                  <span class="subject">
                  <span class="from">Zac Snider</span>
                  <span class="time">Just now</span>
                  </span>
                  <span class="message">
                  Hi mate, how is everything?
                  </span>
                  </a>
              </li>
              <li>
                <a href="index.html#">
                  <span class="photo"><img alt="avatar" src="img/ui-divya.jpg"></span>
                  <span class="subject">
                  <span class="from">Divya Manian</span>
                  <span class="time">40 mins.</span>
                  </span>
                  <span class="message">
                  Hi, I need your help with this.
                  </span>
                  </a>
              </li>
              <li>
                <a href="index.html#">
                  <span class="photo"><img alt="avatar" src="img/ui-danro.jpg"></span>
                  <span class="subject">
                  <span class="from">Dan Rogers</span>
                  <span class="time">2 hrs.</span>
                  </span>
                  <span class="message">
                  Love your new Dashboard.
                  </span>
                  </a>
              </li>
              <li>
                <a href="index.html#">
                  <span class="photo"><img alt="avatar" src="img/ui-sherman.jpg"></span>
                  <span class="subject">
                  <span class="from">Dj Sherman</span>
                  <span class="time">4 hrs.</span>
                  </span>
                  <span class="message">
                  Please, answer asap.
                  </span>
                  </a>
              </li>
              <li>
                <a href="index.html#">See all messages</a>
              </li>
            </ul>
          </li>
          <!-- inbox dropdown end -->
          <!-- notification dropdown start-->
          <li id="header_notification_bar" class="dropdown">
            <a data-toggle="dropdown" class="dropdown-toggle" href="index.html#">
              <i class="fa fa-bell-o"></i>
              <span class="badge bg-warning">7</span>
              </a>
            <ul class="dropdown-menu extended notification">
              <div class="notify-arrow notify-arrow-yellow"></div>
              <li>
                <p class="yellow">You have 7 new notifications</p>
              </li>
              <li>
                <a href="index.html#">
                  <span class="label label-danger"><i class="fa fa-bolt"></i></span>
                  Server Overloaded.
                  <span class="small italic">4 mins.</span>
                  </a>
              </li>
              <li>
                <a href="index.html#">
                  <span class="label label-warning"><i class="fa fa-bell"></i></span>
                  Memory #2 Not Responding.
                  <span class="small italic">30 mins.</span>
                  </a>
              </li>
              <li>
                <a href="index.html#">
                  <span class="label label-danger"><i class="fa fa-bolt"></i></span>
                  Disk Space Reached 85%.
                  <span class="small italic">2 hrs.</span>
                  </a>
              </li>
              <li>
                <a href="index.html#">
                  <span class="label label-success"><i class="fa fa-plus"></i></span>
                  New User Registered.
                  <span class="small italic">3 hrs.</span>
                  </a>
              </li>
              <li>
                <a href="index.html#">See all notifications</a>
              </li>
            </ul>
          </li>
          <!-- notification dropdown end -->
        </ul>
        <!--  notification end -->
      </div>
      <div class="top-menu">
        <ul class="nav pull-right top-menu">
          <li><a class="logout" href="../AdminLogoutServlet">退出系统</a></li>
        </ul>
      </div>
    </header>
    <!--header end-->
    <!-- **********************************************************************************************************************************************************
        MAIN SIDEBAR MENU
        *********************************************************************************************************************************************************** -->
    <!--sidebar start-->
    <aside>
      <div id="sidebar" class="nav-collapse ">
        <!-- sidebar menu start-->
        <ul class="sidebar-menu" id="nav-accordion">
          <p class="centered"><a href="profile.html"><img src="img/ui-sam.jpg" class="img-circle" width="80"></a></p>
          <h5 class="centered">Sam Soffes</h5>
          <li class="sub-menu">
            <a href="javascript:;">
              <i class="fa fa-desktop"></i>
              <span>后台管理</span>
              </a>
          </li>
          <li class="sub-menu">
            <a  href="javascript:;">
              <i class="fa fa-book"></i>
              <span>客户管理</span>
              </a>
            <ul class="sub">
              <li ><a href="customerManagement.jsp">客户管理</a></li>
            </ul>
          </li>
          <li class="sub-menu">
            <a class="active"  href="javascript:;">
              <i class="fa fa-tasks"></i>
              <span>订单管理</span>
              </a>
              <ul class="sub">
              <li ><a href="OrdsManagement.jsp">已有订单</a></li>
              <li class="active"><a href="UnconfirmedOrder.jsp">未确认订单</a></li>
              <li><a href="confirmedOrder.jsp">已确认订单</a></li>
              <li><a href="historyOrder.jsp">历史订单</a></li>
            </ul>
          </li>
          <li class="sub-menu">
            <a  href="javascript:;">
              <i class="fa fa-th"></i>
              <span>商品管理</span>
              </a>
            <ul class="sub">
              <li><a href="basic_table.html">Basic Table</a></li>
              <li><a href="responsive_table.html">Responsive Table</a></li>
              <li ><a href="advanced_table.html">Advanced Table</a></li>
            </ul>
          </li>
          <li class="sub-menu">
            <a href="javascript:;">
              <i class=" fa fa-bar-chart-o"></i>
              <span>统计报表</span>
              </a>
            <ul class="sub">
              <li><a href="morris.html">Morris</a></li>
              <li><a href="chartjs.html">Chartjs</a></li>
              <li><a href="flot_chart.html">Flot Charts</a></li>
              <li><a href="xchart.html">xChart</a></li>
            </ul>
          </li>
          <li class="sub-menu">
            <a href="javascript:;">
              <i class="fa fa-comments-o"></i>
              <span>客户评论</span>
              </a>
            <ul class="sub">
              <li><a href="lobby.html">Lobby</a></li>
              <li><a href="chat_room.html"> Chat Room</a></li>
            </ul>
          </li>
        </ul>
        <!-- sidebar menu end-->
      </div>
    </aside>
    <!--sidebar end-->
    <!-- **********************************************************************************************************************************************************
        MAIN CONTENT
        *********************************************************************************************************************************************************** -->
    <!--main content start-->
    <section id="main-content">
      <section class="wrapper">
        <h3><i class="fa fa-angle-right"></i> 订单管理</h3>
        <div class="row mb">
          <!-- page start-->
		  <div class="col-md-12">
          <div class="content-panel">
            <div class="adv-table">
			  <table class="table table-striped table-advance table-hover" id="hidden-table-info">
                <h4><i class="fa fa-angle-right"></i></h4>
                <hr>
                <thead>
                  <tr>
                    <th><i class="fa fa-bullhorn"></i>订单编号</th>
                    <th class="hidden-phone"><i class="fa fa-question-circle"></i> 订单时间</th>
                    <th><i class="fa fa-bookmark"></i> 收货地址编号</th>
                    <th><i class=" fa fa-edit"></i> 用户名称</th>
                    <th><i class=" fa fa-edit"></i> 订单状态</th>
                    <th>确认订单</th> 
                  </tr>
                </thead>
                
                <%
                	IOrderInfoService orderInfoService=new OrderService();
                	List<OrderInfo> list=orderInfoService.querAllSuitablefirmedOrder(0);
                	request.setAttribute("list", list);
                	
                	
                	
                	
                	IUserInfoService userInfoService=new UserInfoService();
                	pageContext.setAttribute("userInfoService", userInfoService);
                	//userInfoService.getUserNameByUserId(user_id)
                	
                	

                %>
                
                <tbody>
                  <c:forEach items="${list }" var="order">
                  	  
	                  <tr>
	                  <form method="post" action="../ConfirmAnOrderServlet?id=${order.getOrder_id()}">
		                <td >${order.getOrder_id()}</td>
		                <td >${order.getOrder_date()}</td>
		                <td>${order.getRec_id()} </td>
		                <td>${userInfoService.getUserNameByUserId(order.getUser_id())} </td>
		               	<c:choose>
		               		<c:when test="${order.getOrder_state()==0}">
		               			<td><span class="label label-info label-mini">未确认</span></td>
		               		</c:when>
		               		<c:when test="${order.getOrder_state()==1}">
		               			<td><span class="label label-success label-mini">已确定</span></td>
		               			
		               		</c:when>
		               		<c:otherwise>
		               			<td><span class="label label-warning label-mini">未知</span></td>
    						</c:otherwise>
		               	</c:choose>
		                
		               <td>
		               	  <c:if test="${order.getOrder_state()==0}">
   							  <button class="btn btn-success btn-xs"  οnclick="this.form.submit()"><i class="fa fa-check" ></i></button>
						  </c:if>
						  <c:if test="${order.getOrder_state()==1}">
   							  <button class="btn btn-success btn-xs"  οnclick="this.form.submit()" disabled="disabled"><i class="fa fa-check" ></i></button>
						  </c:if>
		                  <!--  <button class="btn btn-primary btn-xs"><i class="fa fa-pencil"></i></button>-->
		                  <!--  <button class="btn btn-danger btn-xs"><i class="fa fa-trash-o"></i></button>-->
		                </td> 
		                </form>
	                  </tr>
	                  
                  </c:forEach>
                  
                
                </tbody>
              </table>
            </div>
          </div>
          <!-- page end-->
		   </div>
          <!-- /col-md-12 -->
        </div>
        <!-- /row -->
      </section>
      <!-- /wrapper -->
    </section>
    <!-- /MAIN CONTENT -->
    <!--main content end-->
    <!--footer start-->
    <footer class="site-footer">
      <div class="text-center">
        <p>
          &copy; Copyrights <strong>Dashio</strong>. All Rights Reserved
        </p>
        <div class="credits">
          More Templates <a href="http://www.cssmoban.com/" target="_blank" title="模板之家">模板之家</a> - Collect from <a href="http://www.cssmoban.com/" title="网页模板" target="_blank">网页模板</a>
        </div>
        <a href="advanced_table.html#" class="go-top">
          <i class="fa fa-angle-up"></i>
          </a>
      </div>
    </footer>
    <!--footer end-->
  </section>
  <!-- js placed at the end of the document so the pages load faster -->
  <script src="lib/jquery/jquery.min.js"></script>
  <script type="text/javascript" language="javascript" src="lib/advanced-datatable/js/jquery.js"></script>
  <script src="lib/bootstrap/js/bootstrap.min.js"></script>
  <script class="include" type="text/javascript" src="lib/jquery.dcjqaccordion.2.7.js"></script>
  <script src="lib/jquery.scrollTo.min.js"></script>
  <script src="lib/jquery.nicescroll.js" type="text/javascript"></script>
  <script type="text/javascript" language="javascript" src="lib/advanced-datatable/js/jquery.dataTables.js"></script>
  <script type="text/javascript" src="lib/advanced-datatable/js/DT_bootstrap.js"></script>
  <!--common script for all pages-->
  <script src="lib/common-scripts.js"></script>
  <!--script for this page-->
  <script type="text/javascript">
  	
  
  
  
    /* Formating function for row details */
    function fnFormatDetails(oTable, nTr) {
      var aData = oTable.fnGetData(nTr);
      
      <%!
      		ISkiService skiService=new SkiService();
      		String ski_id="A100102";
      		
      		IRecInfoService recInfoService=new RecInfoService();
      		
      %>
      
      
      
      var sOut = '<table cellpadding="5" width="500" cellspacing="0" border="0" style="padding-left:50px;">';
        
      
      	sOut += '<thead>';
    	sOut += '<tr>';
    	sOut += '<th>编号</th>';
    	sOut += '<th>订单编号</th>';
    	sOut += '<th>商品编号</th>';
    	sOut += '<th>商品数量</th>';
    	sOut += '<th></th>';
    	sOut += '<th></th>';
    	sOut += '</tr>';
    	sOut += '</thead>';
    	sOut += '<tbody id="table-main">';
    	sOut += '</tbody>';
    	sOut += '</table>';
      	
    
		$.ajax({
				//提交给服务器的处理者[请求地址]
				url:"../GetDetailedInformationServlet",
				//请求方式
				type:"post",
				//请求的媒体类型[编码]
	          	//contentType: "application/json;charset=UTF-8",
	          	//数据[json字符串]
	          	dataType : "json",
	          	data:{"deptid":aData[1]},
	          		
	          		//请求成功
	               success : function(data) {   
	            	
	               	//var result=eval("("+result+")");
	               //	html = $($.parseHTML(result)).find('#Gallery').html();
	               	var $tbody = $("#table-main");
					var $data = $(data);
					var rec_id=aData[3];
					//var name=getSki(this.ski_id);
					/*forEach循环遍历  */
					$data.each(
						function() {
							var ski_Id=<%=ski_id%>=this.ski_id;
							alert(<%=ski_id%>);
							
						
							
							
							$tbody.append("<tr >");
							$tbody.append("<td>" + this.ords_id + "</td>");
							$tbody.append("<td>" + this.order_id + "</td>");
							$tbody.append("<td>" +'<%=skiService.query(ski_id).getSki_name()%>'+ "</td>");
							$tbody.append("<td>" + this.count + "</td>");
							$tbody.append("</tr >");
						});
					
				
					
					
					$tbody.append("<tr>");
					$tbody.append("<td>    </td>");
					$tbody.append("</tr >");
					
					$tbody.append("<tr>");
					$tbody.append("<td alight='center' colspan='4'>" +'收货详情'+ "</td>");
					$tbody.append("</tr >");
					
					$tbody.append("<tr>");
					$tbody.append("<td alight='right' colspan='2'>" +'收货人名称：'+ "</td>");
					$tbody.append("<td alight='left' colspan='2'>" +'<%=recInfoService.queryOneRecInfo(30000).getRec_name()%>'+ "</td>");
					$tbody.append("</tr >");
					
					$tbody.append("<tr>");
					$tbody.append("<td alight='right' colspan='2'>" +'收货人联系方式：'+ "</td>");
					$tbody.append("<td alight='left' colspan='2'>" +'<%=recInfoService.queryOneRecInfo(30000).getRec_phone()%>'+ "</td>");
					$tbody.append("</tr >");
					
					$tbody.append("<tr>");
					$tbody.append("<td alight='right' colspan='2'>" +'收货地址：'+ "</td>");
					$tbody.append("<td alight='left' colspan='2'>" +'<%=recInfoService.queryOneRecInfo(30000).getRec_address()%>'+ "</td>");
					$tbody.append("</tr >");
	            	   
	               },
	               //请求失败，包含具体的错误信息
	               error : function(e){
	               		//	$("#mydiv").html(e.status+"<br>"+e.responseText);
	                 //alert(e);
	               }
			});
		
		
		return sOut;
    }

    $(document).ready(function() {
      /*
       * Insert a 'details' column to the table
       */
      var nCloneTh = document.createElement('th');
      var nCloneTd = document.createElement('td');
      nCloneTd.innerHTML = '<img src="lib/advanced-datatable/images/details_open.png">';
      nCloneTd.className = "center";

      $('#hidden-table-info thead tr').each(function() {
        this.insertBefore(nCloneTh, this.childNodes[0]);
      });

      $('#hidden-table-info tbody tr').each(function() {
        this.insertBefore(nCloneTd.cloneNode(true), this.childNodes[0]);
      });

      /*
       * Initialse DataTables, with no sorting on the 'details' column
       */
      var oTable = $('#hidden-table-info').dataTable({
        "aoColumnDefs": [{
          "bSortable": false,
          "aTargets": [0]
        }],
        "aaSorting": [
          [1, 'asc']
        ]
      });

      /* Add event listener for opening and closing details
       * Note that the indicator for showing which row is open is not controlled by DataTables,
       * rather it is done here
       */
      $('#hidden-table-info tbody td img').live('click', function() {
        var nTr = $(this).parents('tr')[0];
        if (oTable.fnIsOpen(nTr)) {
          /* This row is already open - close it */
          this.src = "lib/advanced-datatable/images/details_open.png";
          oTable.fnClose(nTr);
        } else {
          /* Open this row */
          this.src = "lib/advanced-datatable/images/details_close.png";
          oTable.fnOpen(nTr, fnFormatDetails(oTable, nTr), 'details');
        }
      });
    });
  </script>
</body>
</html>