<%--
  Created by IntelliJ IDEA.
  User: hadoop
  Date: 2017/8/30
  Time: 23:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>注册</title>

    <script type="text/javascript">
        function checkpwd(){
            var password=document.register.password.value;
            var password2=document.register.password2.value;
            if(password==""){
                alert("请输入密码！");
                document.register.password.focus();//焦点放到密码框
                return false; //退出检测函数
            }

            if(password!=password2){
                document.getElementById("msg").innerHTML = "两次输入密码不一致，请重新输入";//在div显示错误信息
                return false;
            } else {
                document.getElementById("msg").innerHTML = " ";
            }
        }

        function addCheck(){
            var username=document.register.username.value;
            var password=document.register.username.password;
            var password2=document.register.username.password2;
            if(username==""){
                alert("用户名不能为空!");
                document.register.username.focus();
                return false;
            }
            if(password==""){
                alert("密码不能为空!");
                document.register.password.focus();
                return false;
            }
            if(password!=password2){
                alert("两次输入密码不相同!");
                document.register.password2.focus();
                return false;
            }
        }

        function validate(){
            var flag=addCheck();
            if(flag==false)
                return false;
            return true;
        }

    </script>


</head>




<body>

<h2 align="center" style="margin-top: 20px">欢迎来到馨香园</h2>

<form name="register" align="center" style="margin-top: 50px;" method="post" action="/user/register" onsubmit = "return validate()">

    <table style="margin-top: 50px; margin-left: 550px">
        <tr>
            <td>用&nbsp;户&nbsp;名:</td>
            <td><input type="text" name="username" required></td>
        </tr>
        <tr>
            <td>性&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;别:</td>
            <td>
                <label><input name="sex" type="radio" value="男" />男 </label>
                <label><input name="sex" type="radio" value="女" />女 </label>
            </td>
        </tr>
        <tr>
            <td>年&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;龄:</td>
            <td><input type="text" name="age"></td>
        </tr>
        <tr>
            <td>工&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;作:</td>
            <td><input type="text" name="work"></td>
        </tr>
        <tr>
            <td>住&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;址:</td>
            <td><input type="text" name="address"></td>
        </tr>
        <tr>
            <td>电话号码:</td>
            <td><input type="text" name="number" required></td>
        </tr>
        <tr>
            <td>密&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;码:</td>
            <td><input type="password" name="password" required></td>
        </tr>
        <tr>
            <td>确认密码:</td>
            <td><input type="password" name="password2" onchange="checkpwd()"></td>
            <td><div id="msg" style="color:red;"></div></td>
        </tr>

    </table>
    <br><br>
    <input type="submit" name="注册" style="width:100px;height:50px">
</form>



</body>
</html>
