<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="sf" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="s"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<div class="row">
    <div class="col-lg-12">

        <div class="ibox float-e-margins">
            <div class="ibox-title">
                <h5>Donor List</h5>
                <div class="ibox-tools">
                    <a href="<c:url value="/admin/donor/add-new-donor" />">
                        <span class="label label-primary pull-right">
                            <i class="fa fa-user"></i> NEW
                        </span>
                    </a>
                </div>
            </div>
            <div class="ibox-content">
                <table class="table">
                    <thead>
                        <tr>
                            <th>ID</th>
                            <th>Full Name</th>
                            <th>Age</th>
                            <th>Mobile Number</th>
                            <th>Previous Donation</th>
                            <th>Action</th>
                        </tr>
                    </thead>
                    <tbody>
                        <c:forEach items="${donors}" var="donor">
                            <tr>
                                <td><c:out value="${donor.donorId}" /></td>
                                <td><c:out value="${donor.fullName}" /></td>
                                <td><c:out value="${donor.age}" /></td>
                                <td><c:out value="${donor.mobileNumber}" /></td>
                                <td>
                                    <c:choose>
                                        <c:when test="${donor.donorPreviousDonationHistory.donationStatus == 'Yes'}">
                                            <c:out value="${donor.donorPreviousDonationHistory.donationDate}" />
                                        </c:when>
                                        <c:otherwise>
                                            <c:out value="${donor.donorPreviousDonationHistory.donationStatus}" />
                                        </c:otherwise>
                                    </c:choose>
                                </td>
                                <td>
                                    <a href="<c:url value="/admin/donor/edit/${donor.id}" />" class="btn btn-success">
                                        <i class="fa fa-edit"></i>
                                    </a>
                                    <a href="<c:url value="/admin/donor/show/${donor.id}" />" class="btn btn-info">
                                        <i class="fa fa-eye"></i>
                                    </a>
                                    <a href="<c:url value="/admin/donor/delete/${donor.id}" />" class="btn btn-danger" onClick="return checkDelete();">
                                        <i class="fa fa-trash"></i>
                                    </a>
                                </td>
                            </tr>
                        </c:forEach>
                    </tbody>
                </table>
            </div>
        </div>
    </div>
</div>