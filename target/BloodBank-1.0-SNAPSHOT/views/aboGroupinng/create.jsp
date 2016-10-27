<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="sf" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="s"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<div class="row">
    <div class="col-lg-12">
        <div class="ibox float-e-margins">
            <div class="ibox-title">
                <h5>DONOR GROUPING</h5>
            </div>
            <div class="ibox-content">
                <sf:form class="form" commandName="aboGroup" method="POST">
                    <div class="row">
                        <div class="col-lg-6">
                            <c:set var="sampleNumberHasBindError"><sf:errors path="sampleNumber"/></c:set>
                            <div class="form-group <c:if test="${!empty sampleNumberHasBindError}" > has-error </c:if> ">
                                <sf:label path="sampleNumber" cssClass="control-label">Sample Number</sf:label>
                                <sf:input path="sampleNumber" cssClass="form-control" palceholder="Full Name" />
                                <p><sf:errors path="sampleNumber" /></p>
                            </div>
                            <c:set var="donorIdHasBindError"><sf:errors path="donorId"/></c:set>
                            <div class="form-group <c:if test="${!empty donorIdHasBindError}" > has-error </c:if> ">
                                <sf:label path="donor" cssClass="control-label">Blood Donor</sf:label>
                                <sf:select path="donor" cssClass="form-control" >
                                    <sf:option value="${null}">--- Select Item Name ---</sf:option>
                                    <sf:options items="${donors}" itemValue="donorId" itemLabel="fullName"/>
                                </sf:select>
                                <p><sf:errors path="donorId" /></p>
                            </div>
                            <script>
                                function doSearch() {
                                    var url = "<c:url value='/admin/donor/abo-grouping/search' />";
                                    $.getJSON(
                                            url,
                                            {CHARS: $('#donor').val()},
                                            function (data) {
                                                alert(data);
                                            });
                                }
                            </script>
                            <h3>ABO Grouping Test Result</h3>
                            <hr/>
                            <c:set var="aboGroupingAntiAHasBindError"><sf:errors path="aboGroupingAntiA"/></c:set>
                            <div class="form-group <c:if test="${!empty aboGroupingAntiAHasBindError}" > has-error </c:if> ">
                                <sf:label path="aboGroupingAntiA" cssClass="control-label">Anti - A</sf:label>
                                <sf:input path="aboGroupingAntiA" cssClass="form-control" palceholder="Anti - A" />
                                <p><sf:errors path="aboGroupingAntiA" /></p>
                            </div>
                            <c:set var="aboGroupingAntiBHasBindError"><sf:errors path="aboGroupingAntiB"/></c:set>
                            <div class="form-group <c:if test="${!empty aboGroupingAntiBHasBindError}" > has-error </c:if> ">
                                <sf:label path="aboGroupingAntiB" cssClass="control-label">Anti - B</sf:label>
                                <sf:input path="aboGroupingAntiB" cssClass="form-control" palceholder="Anti - B" />
                                <p><sf:errors path="aboGroupingAntiB" /></p>
                            </div>
                            <c:set var="aboGroupingAntiABHasBindError"><sf:errors path="aboGroupingAntiAB"/></c:set>
                            <div class="form-group <c:if test="${!empty aboGroupingAntiABHasBindError}" > has-error </c:if> ">
                                <sf:label path="aboGroupingAntiAB" cssClass="control-label">Anti - AB</sf:label>
                                <sf:input path="aboGroupingAntiAB" cssClass="form-control" palceholder="Anti - AB" />
                                <p><sf:errors path="aboGroupingAntiAB" /></p>
                            </div>
                            <c:set var="aboGroupingACellHasBindError"><sf:errors path="aboGroupingACell"/></c:set>
                            <div class="form-group <c:if test="${!empty aboGroupingACellHasBindError}" > has-error </c:if> ">
                                <sf:label path="aboGroupingACell" cssClass="control-label">A - Cell</sf:label>
                                <sf:input path="aboGroupingACell" cssClass="form-control" palceholder="A - Cell" />
                                <p><sf:errors path="aboGroupingACell" /></p>
                            </div>
                            <c:set var="aboGroupingBCellHasBindError"><sf:errors path="aboGroupingBCell"/></c:set>
                            <div class="form-group <c:if test="${!empty aboGroupingBCellHasBindError}" > has-error </c:if> ">
                                <sf:label path="aboGroupingBCell" cssClass="control-label">B - Cell</sf:label>
                                <sf:input path="aboGroupingBCell" cssClass="form-control" palceholder="B - Cell" />
                                <p><sf:errors path="aboGroupingBCell" /></p>
                            </div>
                            <c:set var="aboGroupingOCellHasBindError"><sf:errors path="aboGroupingOCell"/></c:set>
                            <div class="form-group <c:if test="${!empty aboGroupingOCellHasBindError}" > has-error </c:if> ">
                                <sf:label path="aboGroupingOCell" cssClass="control-label">O - Cell</sf:label>
                                <sf:input path="aboGroupingOCell" cssClass="form-control" palceholder="O - Cell" />
                                <p><sf:errors path="aboGroupingOCell" /></p>
                            </div>
                            <c:set var="aboGroupingResultHasBindError"><sf:errors path="aboGroupingResult"/></c:set>
                            <div class="form-group <c:if test="${!empty aboGroupingResultHasBindError}" > has-error </c:if> ">
                                <sf:label path="aboGroupingResult" cssClass="control-label">Result</sf:label>
                                <sf:textarea path="aboGroupingResult" cssClass="form-control" palceholder="" />
                                <p><sf:errors path="aboGroupingResult" /></p>
                            </div>
                        </div>
                        <div class="col-lg-6">
                            <c:set var="aboGroupingDateHasBindError"><sf:errors path="aboGroupingDate"/></c:set>
                            <div class="form-group <c:if test="${!empty aboGroupingDateHasBindError}" > has-error </c:if> ">
                                <sf:label path="aboGroupingDate" cssClass="control-label">Date (yyyy/MM/dd)</sf:label>
                                <sf:input path="aboGroupingDate" cssClass="form-control" palceholder="" />
                                <p><sf:errors path="aboGroupingDate" /></p>
                            </div>
                            <c:set var="bloodDonorGroupHasBindError"><sf:errors path="bloodDonorGroup"/></c:set>
                            <div class="form-group <c:if test="${!empty bloodDonorGroupHasBindError}" > has-error </c:if> ">
                                <sf:label path="bloodDonorGroup" cssClass="control-label">Blood Donor Group</sf:label>
                                <sf:input path="bloodDonorGroup" cssClass="form-control" palceholder="Full Name" />
                                <p><sf:errors path="bloodDonorGroup" /></p>
                            </div>
                            <h3>Rhesus Grouping Test Result</h3>
                            <hr/>
                            <c:set var="rhesusGroupingAntiDHasBindError"><sf:errors path="rhesusGroupingAntiD"/></c:set>
                            <div class="form-group <c:if test="${!empty rhesusGroupingAntiDHasBindError}" > has-error </c:if> ">
                                <sf:label path="rhesusGroupingAntiD" cssClass="control-label">Anti - D</sf:label>
                                <sf:input path="rhesusGroupingAntiD" cssClass="form-control" palceholder="" />
                                <p><sf:errors path="rhesusGroupingAntiD" /></p>
                            </div>
                            <c:set var="rhesusGroupingResultHasBindError"><sf:errors path="rhesusGroupingResult"/></c:set>
                            <div class="form-group <c:if test="${!empty rhesusGroupingResultHasBindError}" > has-error </c:if> ">
                                <sf:label path="rhesusGroupingResult" cssClass="control-label">Result</sf:label>
                                <sf:textarea path="rhesusGroupingResult" cssClass="form-control" palceholder="" />
                                <p><sf:errors path="rhesusGroupingResult" /></p>
                            </div>
                            <hr/>
                            <c:set var="signMtLabHasBindError"><sf:errors path="signMtLab"/></c:set>
                            <div class="form-group <c:if test="${!empty signMtLabHasBindError}" > has-error </c:if> ">
                                <sf:label path="signMtLab" cssClass="control-label">Sign (MT Lab)</sf:label>
                                <sf:input path="signMtLab" cssClass="form-control" palceholder="Sign (MT Lab)" />
                                <p><sf:errors path="signMtLab" /></p>
                            </div>
                            <c:set var="commentHasBindError"><sf:errors path="comment"/></c:set>
                            <div class="form-group <c:if test="${!empty commentHasBindError}" > has-error </c:if> ">
                                <sf:label path="comment" cssClass="control-label">Comment</sf:label>
                                <sf:textarea path="comment" cssClass="form-control" palceholder="" />
                                <p><sf:errors path="comment" /></p>
                            </div>  
                        </div>
                    </div>
                    <div class="row">
                        <div class="col-lg-6">
                            <div class="form-group">
                                <div class="">
                                    <button class="btn btn-sm btn-info" type="submit">Save ABO Group</button>
                                </div>
                            </div>
                        </div>
                    </div>
                </sf:form>
            </div>
            <div class="ibox-footer">
            </div>
        </div>
    </div>
</div>