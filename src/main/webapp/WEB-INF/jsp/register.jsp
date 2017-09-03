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



</head>


<script type="text/javascript">
    function checkpwd(){
        var p1=document.form.password.value;//获取密码框的值
        var p2=document.form.password2.value;//获取重新输入的密码值
        if(p1==""){
            alert("请输入密码！");//检测到密码为空，提醒输入//
            document.form.password.focus();//焦点放到密码框
            return false;//退出检测函数
        }//如果允许空密码，可取消这个条件

        if(p1!=p2){//判断两次输入的值是否一致，不一致则显示错误信息
            document.getElementByIdx_x("msg").innerHTML="两次输入密码不一致，请重新输入";//在div显示错误信息
            return false;
        }else{
            //密码一致，可以继续下一步操作
        }
    }
</script>

<body>

    <h2 align="center" style="margin-top: 20px">欢迎来到馨香园</h2>

    <form align="center" style="margin-top: 50px" method="post" action="/user/register">
        <%--用户名<input type="text" name="username"/><br>--%>
        <%--性别<input type="checkbox" name="男"/> <input type="checkbox" name="女"/>--%>
        <%--电话号码<input type="text" name="number"/>--%>
        <%--工作<input type="text" name="work"/>--%>
        <%--地址<input type="text" name="address">--%>
        <%--密码<input type="password" name="password"/><br>--%>
        <%--确认密码<input type="password2" name="password"/><br>--%>

            <table align="center" style="margin-top: 50px">
                <tr>
                    <td>用&nbsp;户&nbsp;名:</td>
                    <td><input type="text" name="username"></td>
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
                    <td><input type="text" name="number"></td>
                </tr>
                <tr>
                    <td>密&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;码:</td>
                    <td><input type="password" name="password"></td>
                </tr>
                <tr>
                    <td>确认密码:</td>
                    <td><input type="password" name="password2" onchange="checkpwd()"></td>
                    <div id="msg" style="color:red;">111111</div>
                </tr>


            </table>

        <input type="submit" name="注册">
    </form>

</body>
</html>
