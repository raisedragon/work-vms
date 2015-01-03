<%@ taglib uri="http://displaytag.sf.net" prefix="display"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<head>
<title>Country List</title>
</head>

<display:table name="authorityList" class="table" requestURI=""
	id="authorityList" export="true" pagesize="25">
	<display:column property="id" sortable="true" href="authorityform.html"
		media="html" paramId="id" paramProperty="id" titleKey="authority.id" />
	<display:column property="id" media="csv excel xml pdf"
		titleKey="authority.id" />
	<display:column property="authorityName" sortable="true"
		titleKey="authority.authorityName" />
	<display:column sortProperty="version" sortable="true"
		titleKey="authority.version">
		<fmt:formatDate value="${authorityList.version}" pattern="${datePattern}" />
	</display:column>

	<display:setProperty name="paging.banner.item_name">
		<fmt:message key="authorityList.authority" />
	</display:setProperty>
	<display:setProperty name="paging.banner.items_name">
		<fmt:message key="authorityList.authorities" />
	</display:setProperty>

	<display:setProperty name="export.excel.filename">
		<fmt:message key="authorityList.title" />.xls</display:setProperty>
	<display:setProperty name="export.csv.filename">
		<fmt:message key="authorityList.title" />.csv</display:setProperty>
	<display:setProperty name="export.pdf.filename">
		<fmt:message key="authorityList.title" />.pdf</display:setProperty>
</display:table>

<c:out value="${buttons}" escapeXml="false" />

<script type="text/javascript">
	highlightTableRows("authorityList");
</script>
