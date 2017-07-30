<%-- 
    Document   : front-nav
    Created on : May 27, 2017, May 27, 2017 1:07:21 PM
    Author     : DELL
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<body class="homepage">
    <div id="page-wrapper">

        <!-- Header -->
        <div id="header">
            <div class="container">

                <!-- Logo -->
                <div id="logo">
                    <a  class="pennant"><img src="${pageContext.request.contextPath}/images/ohm.png" alt="logo" /></a>
                    <h1><a href="${pageContext.request.contextPath}/index">Temple Website</a></h1>
                </div>

                <!-- Nav -->
                <nav id="nav">
                    <ul>
                        <li class="active"><a href="${pageContext.request.contextPath}/index">Home</a></li>
                        <li>
                            <a href="${pageContext.request.contextPath}/index3" class="icon fa-caret-down">About</a>
                            <ul>
                                <li><a href="${pageContext.request.contextPath}/introduction">Introduction</a></li>
                                <li><a href="${pageContext.request.contextPath}/mission">Mission</a></li>
                                <li><a href="${pageContext.request.contextPath}/vision">Visison</a></li>
                                
                            </ul>
                        </li>
                        <li>
                            <a href="${pageContext.request.contextPath}/index" class="icon fa-caret-down" >Events</a>

                            <ul>
                                <c:forEach items="${eventdata}" var="event">
                                    <li><a href="${pageContext.request.contextPath}/event/view/?id=${event.eid}">${event.eventName}</a></li>

                                </c:forEach>

                            </ul>

                        </li>
                        <li><a href="${pageContext.request.contextPath}/contact" class="icon fa-caret-down">Contact</a></li>
                        <li>
                            <a href="${pageContext.request.contextPath}/index1" class="icon fa-caret-down" >Worship</a>

                            <ul>
                                <c:forEach items="${worshipdata}" var="worship">
                                    <li><a href="${pageContext.request.contextPath}/worship/view/?id=${worship.wid}"> ${worship.pujaName}</a></li>

                                </c:forEach>
                            </ul>                           
                        </li>
                        <li>
                            <a href="${pageContext.request.contextPath}/index2" class="icon fa-caret-down">Carousel</a>

                            <ul>
                                <c:forEach items="${carouseldata}" var="carousel">
                                    <li><a href="${pageContext.request.contextPath}/carousel/view/?id=${carousel.id}"> ${carousel.file}</a></li>
<!--                                    <li><a href="${pageContext.request.contextPath}/carousel/view/?id=${carousel.id}"> 
                                            <img height="30" width="30" src="${pageContext.request.contextPath}/images/${carousel.file}">-->
                                </a></li>

                                </c:forEach>
                            </ul>                     
                        </li>


                        <li><a href="${pageContext.request.contextPath}/register">Register</a></li>
                        <li><a href="${pageContext.request.contextPath}/login">Sign-In</a></li>

                    </ul>
                </nav>

            </div>
        </div>
    </div>
