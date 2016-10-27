<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="sf" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="s"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<div class="row">
    <div class="col-lg-12">
        <div class="ibox float-e-margins">
            <div class="ibox-title">
                <h5>DONOR GROUPING REGISTER</h5>
                <div class="ibox-tools">
                    <a target="_blank" href="<c:url value="/admin/donor/abo-grouping/pdf" />">
                        <span class="label label-primary pull-right">
                            Generate PDF
                        </span>
                    </a>
                    <a target="_blank" href="<c:url value="/admin/donor/abo-grouping/excell" />">
                        <span class="label label-primary pull-right">
                            Generate Excell
                        </span>
                    </a>
                    <a target="_blank" href="<c:url value="/admin/donor/abo-grouping/csv" />">
                        <span class="label label-primary pull-right">
                            Generate CSV
                        </span>
                    </a>
                            
                    <a href="<c:url value="/admin/donor/abo-grouping/add" />">
                        <span class="label label-primary pull-right">
                            NEW
                        </span>
                    </a>
                </div>
            </div>
            <div class="ibox-content">
                <table class="table table-bordered">
                    <thead>
                        <tr>
                            <th>Date</th>
                            <th>Si No.</th>
                            <th>Blood Donor Id No.</th>
                            <th>Blood Donor Name</th>
                            <th>
                                ABO Grouping
                                <table class="table-bordered table">
                                    <tr>
                                        <th>Anti- A</th>
                                        <th>Anti- B</th>
                                        <th>Anti- AB</th>
                                        <th>A-Cell</th>
                                        <th>B-Cell</th>
                                        <th>O-Cell</th>
                                        <th>Result</th>
                                    </tr>
                                </table>
                            </th>
                            <th>
                                Rhesus Grouping
                                <table class="table-bordered table">
                                    <tr>
                                        <th>Anti- D</th>
                                        <th>Anti- D</th>
                                        <th>Result</th>
                                    </tr>
                                </table>
                            </th>
                            <th>Blood donor Group </th>
                            <th>Sign (MT- Lab)</th>
                            <th>Comment</th>
                        </tr>
                    </thead>
                    <tbody>
                        <c:forEach items="${aboGroups}" var="aboGroup">
                            <tr>
                                <td><c:out value="${aboGroup.aboGroupingDate}" /></td>
                                <td><c:out value="${aboGroup.sampleNumber}" /></td>
                                <td><c:out value="${aboGroup.donorId}" /></td>
                                <td><c:out value="${aboGroup.donor.fullName}" /></td>
                                <td>
                                    <table class="table-bordered table">
                                        <tr>
                                            <td><c:out value="${aboGroup.aboGroupingAntiA}" /></td>
                                            <td><c:out value="${aboGroup.aboGroupingAntiB}" /></td>
                                            <td><c:out value="${aboGroup.aboGroupingAntiAB}" /></td>
                                            <td><c:out value="${aboGroup.aboGroupingACell}" /></td>
                                            <td><c:out value="${aboGroup.aboGroupingBCell}" /></td>
                                            <td><c:out value="${aboGroup.aboGroupingOCell}" /></td>
                                            <td><c:out value="${aboGroup.aboGroupingResult}" /></td>
                                        </tr>
                                    </table>
                                </td>
                                <td>
                                    <table class="table-bordered table">
                                        <tr>
                                            <td><c:out value="${aboGroup.rhesusGroupingAntiD}" /></td>
                                            <td><c:out value="${aboGroup.rhesusGroupingAntiD}" /></td>
                                            <td><c:out value="${aboGroup.rhesusGroupingResult}" /></td>
                                        </tr>
                                    </table>
                                </td>
                                <td><c:out value="${aboGroup.bloodDonorGroup}" /></td>
                                <td><c:out value="${aboGroup.signMtLab}" /></td>
                                <td><c:out value="${aboGroup.comment}" /></td>
                            </tr>
                        </c:forEach>
                    </tbody>
                </table>
            </div>
        </div>
    </div>
</div>