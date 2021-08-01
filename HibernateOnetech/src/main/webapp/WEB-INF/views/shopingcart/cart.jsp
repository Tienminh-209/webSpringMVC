<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en">
<head>
<title>Cart</title>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="description" content="OneTech shop project">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" type="text/css"
	href="resources/styles/bootstrap4/bootstrap.min.css">
<link
	href="resources/plugins/fontawesome-free-5.0.1/css/fontawesome-all.css"
	rel="stylesheet" type="text/css">
<link rel="stylesheet" type="text/css"
	href="resources/styles/cart_styles.css">
<link rel="stylesheet" type="text/css"
	href="resources/styles/cart_responsive.css">

</head>

<body>
	<jsp:include page="../_header.jsp"></jsp:include>

	<div class="cart_section">
		<div class="container">
			<div class="row">
				<div class="col-lg-10 offset-lg-1">
					<div class="cart_container">
						<div class="cart_title">Shopping Cart</div>
						<div class="cart_items">
							<ul class="cart_list">
								<c:forEach items="${CART}" var="i">
									<li class="cart_item clearfix">
										<div class="cart_item_image">
											<img src="images/shopping_cart.jpg" alt="">
										</div>
										<div
											class="cart_item_info d-flex flex-md-row flex-column justify-content-between">
											<div class="cart_item_name cart_info_col">
												<div class="cart_item_title">Name</div>
												<div class="cart_item_text">${i.value.product.title }</div>
											</div>
											<div class="cart_item_image">
												<div class="cart_item_title">Images</div>
												<div class="cart_item_image">
													<td class="cart_product"><img
														src="resources/${i.value.product.image }" alt=""
														height=100px width=100px></td>
												</div>
											</div>
											<div class="cart_item_quantity cart_info_col">
												<div class="cart_item_title">Quantity</div>
												<div class="cart_item_text"></div>
												<td class="cart_quantity"><input type="number"
													id="quanty-cart-${i.value.product.id }" name="quantity"
													min="1" max="100" step="1" value="${i.value.quanty }">
												</td>
											</div>
											<div class="cart_item_price cart_info_col">
												<div class="cart_item_title">Price</div>
												<div class="cart_item_text">
													<fmt:formatNumber value="${i.value.product.price }"
														type="number" maxIntegerDigits="14" />
												</div>
											</div>
											<div class="cart_item_total cart_info_col">
												<div class="cart_item_title">Total</div>
												<div class="cart_item_text">
													<td><fmt:formatNumber
															value="${i.value.quanty*i.value.product.price }"
															type="number" maxIntegerDigits="14" /></td>
												</div>
											</div>
											<div class="cart_item_price cart_info_col">
												<div class="cart_item_title"></div>
												<div class="cart_item_title">Delete</div>
												<div class="cart_item_text">
													<td class="cart_delete"><a
														class="cart_quantity_delete"
														href="DeleteCart/${i.value.product.id }">
														<i class="far fa-trash-alt"></i> </a></td>
												</div>
											</div>
											<div class="cart_item_price cart_info_col">
												<div class="cart_item_title"></div>
												<div class="cart_item_title">Edit</div>
												<div class="cart_item_text">
													<td><a data-id="${i.value.product.id }"
										             class="edit-cart" type=button><i class="fa fa-edit"></i> </a></td>
												</div>
											</div>
										</div>
									</li>
								</c:forEach>
							</ul>
						</div>

						<!-- Order Total -->
						<div class="order_total">
							<div class="order_total_content text-md-right">
								<div class="order_total_title">Order Total:</div>
								<div class="order_total_amount">
									<fmt:formatNumber value="${Total_Price_Cart}" type="number"
										maxIntegerDigits="14" />
									(VNĐ)
								</div>
							</div>
						</div>

						<div class="cart_buttons">
							<a href="http://localhost:8080/OneTech/" type="button" class="button cart_button_clear">Tiếp tục mua sắm</a>
							<a type="button" class="button cart_button_checkout">Thanh toán</a>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>


	<!-- Newsletter -->

	<div class="newsletter">
		<div class="container">
			<div class="row">
				<div class="col">
					<div
						class="newsletter_container d-flex flex-lg-row flex-column align-items-lg-center align-items-center justify-content-lg-start justify-content-center">
						<div class="newsletter_title_container">
							<div class="newsletter_icon">
								<img src="resources/images/send.png" alt="">
							</div>
							<div class="newsletter_title">Sign up for Newsletter</div>
							<div class="newsletter_text">
								<p>...and receive %20 coupon for first shopping.</p>
							</div>
						</div>
						<div class="newsletter_content clearfix">
							<form action="#" class="newsletter_form">
								<input type="email" class="newsletter_input" required="required"
									placeholder="Enter your email address">
								<button class="newsletter_button">Subscribe</button>
							</form>
							<div class="newsletter_unsubscribe_link">
								<a href="#">unsubscribe</a>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>

	<!-- Footer -->

	<jsp:include page="../_footer.jsp"></jsp:include>

	<!-- Copyright -->

	<div class="copyright">
		<div class="container">
			<div class="row">
				<div class="col">

					<div
						class="copyright_container d-flex flex-sm-row flex-column align-items-center justify-content-start">
						<div class="copyright_content">
							<!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. -->
							Copyright &copy;
							<script>
								document.write(new Date().getFullYear());
							</script>
							All rights reserved | This template is made with <i
								class="fa fa-heart" aria-hidden="true"></i> by <a
								href="https://colorlib.com" target="_blank">Colorlib</a>
							<!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. -->
						</div>
						<div class="logos ml-sm-auto">
							<ul class="logos_list">
								<li><a href="#"><img src="resources/images/logos_1.png"
										alt=""></a></li>
								<li><a href="#"><img src="resources/images/logos_2.png"
										alt=""></a></li>
								<li><a href="#"><img src="resources/images/logos_3.png"
										alt=""></a></li>
								<li><a href="#"><img src="resources/images/logos_4.png"
										alt=""></a></li>
							</ul>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
	</div>

	<script src="resources/js/jquery-3.3.1.min.js"></script>
	<script src="resources/styles/bootstrap4/popper.js"></script>
	<script src="resources/styles/bootstrap4/bootstrap.min.js"></script>
	<script src="resources/plugins/greensock/TweenMax.min.js"></script>
	<script src="resources/plugins/greensock/TimelineMax.min.js"></script>
	<script src="resources/plugins/scrollmagic/ScrollMagic.min.js"></script>
	<script src="resources/plugins/greensock/animation.gsap.min.js"></script>
	<script src="resources/plugins/greensock/ScrollToPlugin.min.js"></script>
	<script src="resources/plugins/easing/easing.js"></script>
	<script src="resources/js/cart_custom.js"></script>
	<script>
		$(".edit-cart").on("click", function() {
			var id = $(this).data("id");
			var quanty = $("#quanty-cart-" + id).val();
			if (confirm("Mày thay đổi à!") == true) {
				window.location = "EditCart/" + id + "/" + quanty;
			} else {
				window.location = "";
			}

		});
	</script>

</body>

</html>