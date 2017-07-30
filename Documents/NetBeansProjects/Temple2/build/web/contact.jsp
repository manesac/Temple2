<%-- 
    Document   : contact
    Created on : May 3, 2017, 12:39:01 PM
    Author     : Dell PC
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>


<jsp:include page="front-header.jsp"></jsp:include>

<jsp:include page="front-nav.jsp"></jsp:include>
			<!-- Featured -->
				<div id="featured">
					<section class="container">
						<header>
							<h2><br>Find US</h2>
							<span class="byline"> Don't Hasitiate to ask any question. We feel happy to help you. </span>
						</header>
					</section>
				</div>
				
			<!-- Contact Detail -->
			
            	<!-- contact section 
			================================================== -->
		<section class="contact-section">
			<div class="container">
				<div class="col-md-8">
                                    <form id="contact-form" action="${pageContext.request.contextPath}/contact/add" method="POST">
						<h2>Send us a message</h2>
						<div class="row">
							<div class="col-md-4">
								<input name="name" id="name" type="text" placeholder="Name">
							</div>
							<div class="col-md-4">
								<input name="mail" id="mail" type="text" placeholder="Email">
							</div>
							<div class="col-md-4">
								<input name="tel-number" id="tel-number" type="text" placeholder="Phone">
							</div>
						</div>
						<textarea name="comment" id="comment" placeholder="Message"></textarea>
						<input type="submit" id="submit_contact" value="Send Message">
						<div id="msg" class="message"></div>
					</form>
				</div>
				<div class="col-md-4">
					<div class="contact-info">
						<h2>Contact Info</h2>
						<p>Name of the temple here............</p>
						<ul class="information-list">
							<li><i class="fa fa-map-marker"></i><span>Address like .....Shainbu 3 Karyabinayak lalitpur</span></li>
							<li><i class="fa fa-phone"></i><span>+977-01-55534533</span><span>+977-01-98435352356</span></li>
							<li><i class="fa fa-envelope-o"></i><a href="#">info@templewebsite.org.com</a></li>
                            <li><i class="fa fa-user"></i><span>Contact person <br> Mr. Bdr. Something<br>Founder & President</span></li>
						</ul>						
					</div>
				</div>
			</div>
		</section>
            <!-- contact section ends here...........***********
			================================================== -->
           
<jsp:include page="front-footer.jsp"></jsp:include>