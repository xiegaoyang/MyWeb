<%@page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>

<html>
<head>
    <title>馨香园</title>

    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <meta name="viewport" content="width=device-width,initial-scale=1">
    <link rel="stylesheet" href="css/responsiveslides.css">
    <link rel="stylesheet" href="css/themes.css">
    <script src="js/jquery-1.8.3.min.js"></script>
    <script src="js/responsiveslides.min.js"></script>

</head>
<body>

<div class="banner">
    <script>
        $(function() {
            $("#slider").responsiveSlides({
//                auto : true,
                nav : true,
                speed : 5,
                maxwidth: 800,
                namespace: "centered-btns",
                pager : true
            });
        });
    </script>
    <div id="top" class="rslides_container">
        <ul class="rslides" id="slider">
            <li><img src="images/1.jpg"/></li>
            <li><img src="images/2.jpg"/></li>
            <li><img src="images/3.jpg"/></li>
        </ul>
    </div>
</div>



</body>
</html>