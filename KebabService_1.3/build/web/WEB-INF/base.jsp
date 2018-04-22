<%-- 
    Document   : JSP_test
    Created on : Mar 15, 2018, 10:41:05 AM
    Author     : narval
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <jsp:include page="resourceLoader.jsp"></jsp:include>
        <title>Kebab Master</title>
    </head>
    <body>
        <div class="ui sidebar inverted vertical menu">
        <jsp:include page="mainmenu.jsp"></jsp:include>
  </div>
  <div class="pusher">
            <div class="ui topbar container">
                <div class="ui container masthead">
                    <div class="ui main-header">
                        <div class="ui two column grid">
                            <div class="ten wide column">
                                <div class="ui two column grid">
                                    <div class="three wide column">
                                        <img src="resources/img/doner-kebab-meat-roll.png"></img>         
                                    </div>
                                    <div class="nine wide column">
                                        <h1>Kebab Master</h1>
                                        <em><p>.. Livraisons de kebabs de pères en mères depuis 1632</p></em>
                                    </div>
                               
                                </div>
                            </div>
                            <div class="ui two wide column right floated">
                                <div class="middle aligned content mobile only grid">
                                    <i class="bars large icon sidebarbutton middle aligned "></i>
                                </div>
                            </div>
                        </div>
                        <div class="grid tablet or lower hidden">
                            <nav class="ui inverted menu">
                                <jsp:include page="mainmenu.jsp"></jsp:include>
                            </nav> 
                        </div>
                    </div>
                </div>
            </div>
            <div class="ui container maincontainer">
                <div class="ui divider"></div>
                
