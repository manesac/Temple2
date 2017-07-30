<%-- 
    Document   : eventview
    Created on : May 27, 2017, May 27, 2017 2:01:17 PM
    Author     : DELL
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<jsp:include page="front-header.jsp"></jsp:include>
<jsp:include page="front-nav.jsp"></jsp:include>






<!-- Featured -->
<div id="featured">
    <section class="container">
        <header>
            <h2>Events</h2>

        </header>
    </section>
</div>

<!-- Main -->
<div id="main">
    <section class="container">					
        <h2>${eventdata.get(0).eventName}</h2>
    <h6>
        <span class="glyphicon glyphicon-time">${eventdata.get(0).eventTime}</span>
    </h6>
    <p>${eventdata.get(0).hallName}</p>
    <p>${eventdata.get(0).eventOrganizer}</p>
    
    <p>${eventdata.get(0).eventDescription}</p>
    </section>
</div>

<!-- Footer -->
<!-- footer 
======================*****************************************============================ -->
<jsp:include page="front-footer.jsp"></jsp:include>