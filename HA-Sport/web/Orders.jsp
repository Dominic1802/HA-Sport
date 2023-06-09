
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html lang="en">

    <head>
        <title>HA Shop</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <!--===============================================================================================-->
        <link rel="icon" type="image/png" href="images/icons/favicon.ico" />
        <!--===============================================================================================-->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
        <!--===============================================================================================-->
        <link rel="stylesheet" type="text/css" href="fonts/font-awesome-4.7.0/css/font-awesome.min.css">
        <!--===============================================================================================-->
        <link rel="stylesheet" type="text/css" href="fonts/iconic/css/material-design-iconic-font.min.css">
        <!--===============================================================================================-->
        <link rel="stylesheet" type="text/css" href="vendor/animate/animate.css">
        <!--===============================================================================================-->
        <link rel="stylesheet" type="text/css" href="vendor/css-hamburgers/hamburgers.min.css">
        <!--===============================================================================================-->
        <link rel="stylesheet" type="text/css" href="vendor/animsition/css/animsition.min.css">
        <!--===============================================================================================-->
        <link rel="stylesheet" type="text/css" href="vendor/select2/select2.min.css">
        <!--===============================================================================================-->
        <link rel="stylesheet" type="text/css" href="vendor/daterangepicker/daterangepicker.css">
        <!--===============================================================================================-->
        <link rel="stylesheet" type="text/css" href="css/util.css">
        <link rel="stylesheet" type="text/css" href="css/main.css">

        <!--===============================================================================================-->
    </head>
    <body>
        <%@include file="./Header.jsp" %>
        <div class="container pt-5">

            <h1 class="text-center pb-3">All Order</h1>
            <div class="table-wrapper-scroll-y my-custom-scrollbar">
                <table class="table table-dark" style="height:100px;overflow: scroll;width: 100%;">
                    <thead>
                        <tr>
                            <th> User</th>
                            <th> Full Name</th>
                            <th> Phone</th>
                            <th> Email</th>
                            <th> Address</th>
                            <th> Date Buy</th>
                            <th> Total </th>
                        </tr>
                    </thead>
                    <tbody>
                        <jsp:useBean id="orderDAO" class="dal.OrderDAO" ></jsp:useBean>
                        <jsp:useBean id="accountDAO" class="dal.AccountDAO" ></jsp:useBean>
                        <c:forEach items="${orderDAO.allOrder}" var = "item">
                            <tr>
                                <td>${item.account.accountName}</td>
                                <td>${item.account.fullName}</td>
                                <td>${item.account.phone}</td>
                                <td>${item.account.email}</td>
                                <td>${item.account.address}</td>
                                <td>${item.orderDate}</td>
                                <td>${orderDAO.getTotalMoney(item.orderId)}</td>

                               
                            </tr>
                        </c:forEach>
                    </tbody>
                </table>
            </div>
            
        </div>
        <%@include file="./Footer.jsp" %>
        <!--===============================================================================================-->
        <script src="vendor/jquery/jquery-3.2.1.min.js"></script>
        <!--===============================================================================================-->
        <script src="vendor/animsition/js/animsition.min.js"></script>
        <!--===============================================================================================-->
        <script src="vendor/bootstrap/js/popper.js"></script>
        <script src="vendor/bootstrap/js/bootstrap.min.js"></script>
        <!--===============================================================================================-->
        <script src="vendor/select2/select2.min.js"></script>
        <!--===============================================================================================-->
        <script src="vendor/daterangepicker/moment.min.js"></script>
        <script src="vendor/daterangepicker/daterangepicker.js"></script>
        <!--===============================================================================================-->
        <script src="vendor/countdowntime/countdowntime.js"></script>
        <!--===============================================================================================-->
        <script src="js/main.js"></script>

    </body>
</html>
