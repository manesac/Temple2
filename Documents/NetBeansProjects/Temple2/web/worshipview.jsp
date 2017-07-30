<%-- 
    Document   : worshipview
    Created on : May 29, 2017, May 29, 2017 3:43:47 PM
    Author     : DELL
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:include page="front-header.jsp"></jsp:include>
<jsp:include page="front-nav.jsp"></jsp:include>





<!-- Featured -->
<div id="featured">
    <section class="container">
        <header>
            <h2>Worship</h2>

        </header>
    </section>
</div>

<!-- Main -->
<div id="main">
    <section class="container">					
        <h2>${worshipdata.get(0).pujaName}</h2>
    <h6>
        <span class="glyphicon glyphicon-time">${worshipdata.get(0).pujaTime}</span>
    </h6>
    <h3>${worshipdata.get(0).pujaBy}</h3>
    <img width="400" height="400" src="${pageContext.request.contextPath}/images/Devotees.jpg" alt=""/>
    <p>The Satyanarayan Puja, worship of the lord Satyanarayan and the embodiment of eternal truth, is the most commonly 
        performed ritualistic prayers in Hindu homes. Enthusiastic devotees have been 
       performing this ritual for several reasons. It is observed that after performing this puja with devotion and faith, 
       devotees generally benefit a lot – their problems are resolved and they can get over the difficulties in life.<br><br>
    There are several reasons for the mass popularity of Satyanarayan puja. First of all, it is one of the simplest and easiest 
    rituals performed by the Hindus. Secondly, anyone can perform this puja regardless of age or sex. Even widows can perform the 
    Satyanarayan Vrata. Therefore, it proves that when God is concerned, barriers no longer exist. Only faith, sincerity and devotion counts while performing this ritual. Once again, this puja can be performed any time and on any day, though some days are considered to be more auspicious, such
    as Purnima and Ekadashi.
    
    </p>
<!--   //<img src="${pageContext.request.contextPath}/images/ohm.png" alt="logo" />-->
    </section>
</div>

<!-- Footer -->
<!-- footer 
======================*****************************************============================ -->
<jsp:include page="front-footer.jsp"></jsp:include>