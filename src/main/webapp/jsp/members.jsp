<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="hello.servlet.domain.member.MemberRepository" %>
<%@ page import="hello.servlet.domain.member.Member" %>
<%@ page import="java.util.List" %>
<%
    MemberRepository memberRepository = MemberRepository.getInstance();
    List<Member> members = memberRepository.findAll();
%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<a href="/index.html">메인</a>
<table>
    <thead>
    <th>id</th>
    <th>username</th>
    <th>age</th>
    </thead>
    <tbody>
    <%
        for (Member member : members) {
            out.write("\t<tr>");
            out.write("\t\t<td>" + member.getId() + "</td >");
            out.write("\t\t<td>" + member.getUsername() + "</td >");
            out.write("\t\t<td>" + member.getAge() + "</td >");
            out.write("\t</tr>");
        } %>


    </tbody>
</table>
</body>
</html>
