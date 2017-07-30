<%-- 
    Document   : carouselview
    Created on : May 30, 2017, May 30, 2017 11:04:05 AM
    Author     : DELL
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:include page="front-header.jsp"></jsp:include>
<jsp:include page="front-nav.jsp"></jsp:include>






    <!-- Featured -->
    <div id="featured">
        <section class="container">
            <header>
                <h2>Carousel</h2>

            </header>
        </section>
    </div>

    <!-- Main -->
    <div id="main">
        <section class="container">
            <h2 >${carouseldata.get(0).status}</h2>
        <center>
            <h2 >${carouseldata.get(0).file}</h2>
            <c:if test="${not empty carouseldata.get(0).file}">
            
            <img height="500" width="1000" src="${pageContext.request.contextPath}/images/${carouseldata.get(0).file}">
            </c:if>
        </center>

            

    </section>
</div>

<!-- Footer -->
<!-- footer 
======================*****************************************============================ -->
<jsp:include page="front-footer.jsp"></jsp:include>