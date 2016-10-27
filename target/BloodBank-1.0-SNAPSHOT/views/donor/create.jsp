<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="sf" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="s"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<div class="row">
    <div class="col-lg-12">
        <div class="ibox float-e-margins">
            <div class="ibox-title">
                <h5>Add New Donor</h5>
            </div>
            <div class="ibox-content">
                <sf:form class="form" commandName="combinedCommandObject" method="POST">
                    <div class="row">
                        <div class="col-lg-12">
                            <div class="tabs-container">
                                <div class="tabs-left">
                                    <ul class="nav nav-tabs">
                                        <li class="active">
                                            <a data-toggle="tab" href="#personalInformationTab" aria-expanded="true"> 
                                                Personal Information
                                            </a>
                                        </li>
                                        <li class="">
                                            <a data-toggle="tab" href="#historyOfPreviousDonationTab" aria-expanded="false">
                                                History Of Previous Donation
                                            </a>
                                        </li>
                                        <li class="">
                                            <a data-toggle="tab" href="#healthRelatedInfoTab" aria-expanded="false">
                                                Health Related Information
                                            </a>
                                        </li>
                                        <li class="">
                                            <a data-toggle="tab" href="#donorTypeAndConsentTab" aria-expanded="false">
                                                Donor Type And Consent
                                            </a>
                                        </li>
                                        <li class="">
                                            <a data-toggle="tab" href="#transfusionClottingFactorHistoryTab" aria-expanded="false">
                                                Transfusion Clotting Factor History
                                            </a>
                                        </li>
                                        <li class="">
                                            <a data-toggle="tab" href="#historyTab" aria-expanded="false">
                                                History
                                            </a>
                                        </li>
                                        <li class="">
                                            <a data-toggle="tab" href="#sufferingTab" aria-expanded="false">
                                                Sufferings
                                            </a>
                                        </li>
                                        <li class="">
                                            <a data-toggle="tab" href="#questionTab" aria-expanded="false">
                                                Questions
                                            </a>
                                        </li>                                
                                    </ul>
                                    <div class="tab-content">
                                        <div id="personalInformationTab" class="tab-pane active">
                                            <div class="panel-body">
                                                <c:set var="fullNameHasBindError"><sf:errors path="donorPersonalInformation.fullName"/></c:set>
                                                <div class="form-group <c:if test="${!empty fullNameHasBindError}" > has-error </c:if> ">
                                                    <sf:label path="donorPersonalInformation.fullName" cssClass="control-label">Full Name</sf:label>
                                                    <sf:input path="donorPersonalInformation.fullName" cssClass="form-control" palceholder="Full Name" />
                                                    <p><sf:errors path="donorPersonalInformation.fullName" /></p>
                                                </div>
                                                <c:set var="idNumberHasBindError"><sf:errors path="donorPersonalInformation.idNumber"/></c:set>
                                                <div class="form-group <c:if test="${!empty idNumberHasBindError}" > has-error </c:if> ">
                                                    <sf:label path="donorPersonalInformation.idNumber" cssClass="control-label">ID Number</sf:label>
                                                    <sf:input path="donorPersonalInformation.idNumber" cssClass="form-control" palceholder="ID Number" />
                                                    <p><sf:errors path="donorPersonalInformation.idNumber" /></p>
                                                </div>
                                                <c:set var="ageHasBindError"><sf:errors path="donorPersonalInformation.age"/></c:set>
                                                <div class="form-group <c:if test="${!empty ageHasBindError}" > has-error </c:if> ">
                                                    <sf:label path="donorPersonalInformation.age" cssClass="control-label">Age</sf:label>
                                                    <sf:input path="donorPersonalInformation.age" cssClass="form-control" palceholder="Age" />
                                                    <p><sf:errors path="donorPersonalInformation.age" /></p>
                                                </div>                 
                                                <c:set var="sexHasBindError"><sf:errors path="donorPersonalInformation.sex"/></c:set>
                                                <div class="form-group <c:if test="${!empty sexHasBindError}" > has-error </c:if> ">
                                                    <sf:label path="donorPersonalInformation.sex" cssClass="control-label">Gender</sf:label>
                                                    <sf:radiobutton path="donorPersonalInformation.sex" value="Male" /> Male
                                                    <sf:radiobutton path="donorPersonalInformation.sex" value="Female" /> Female
                                                    <sf:radiobutton path="donorPersonalInformation.sex" value="Other" /> Other
                                                    <p><sf:errors path="donorPersonalInformation.sex" /></p>
                                                </div>   
                                                <c:set var="phoneNumberHasBindError"><sf:errors path="donorPersonalInformation.phoneNumber"/></c:set>
                                                <div class="form-group <c:if test="${!empty phoneNumberHasBindError}" > has-error </c:if> ">
                                                    <sf:label path="donorPersonalInformation.phoneNumber" cssClass="control-label">Phone Number</sf:label>
                                                    <sf:input path="donorPersonalInformation.phoneNumber" cssClass="form-control" palceholder="Phone Number" />
                                                    <p><sf:errors path="donorPersonalInformation.phoneNumber" /></p>
                                                </div>
                                                <c:set var="mobileNumberHasBindError"><sf:errors path="donorPersonalInformation.mobileNumber"/></c:set>
                                                <div class="form-group <c:if test="${!empty mobileNumberHasBindError}" > has-error </c:if> ">
                                                    <sf:label path="donorPersonalInformation.mobileNumber" cssClass="control-label">Mobile Number</sf:label>
                                                    <sf:input path="donorPersonalInformation.mobileNumber" cssClass="form-control" palceholder="Mobile Number" />
                                                    <p><sf:errors path="donorPersonalInformation.mobileNumber" /></p>
                                                </div>
                                                <c:set var="emailHasBindError"><sf:errors path="donorPersonalInformation.email"/></c:set>
                                                <div class="form-group <c:if test="${!empty emailHasBindError}" > has-error </c:if> ">
                                                    <sf:label path="donorPersonalInformation.email" cssClass="control-label">Email</sf:label>
                                                    <sf:input path="donorPersonalInformation.email" type="email" cssClass="form-control" palceholder="Email" />
                                                    <p><sf:errors path="donorPersonalInformation.email" /></p>
                                                </div>                                
                                                <c:set var="maritalStatusHasBindError"><sf:errors path="donorPersonalInformation.maritalStatus"/></c:set>
                                                <div class="form-group <c:if test="${!empty maritalStatusHasBindError}" > has-error </c:if> ">
                                                    <sf:label path="donorPersonalInformation.sex" cssClass="control-label">Marital Status</sf:label>
                                                    <sf:radiobutton path="donorPersonalInformation.maritalStatus" checked="checked" value="Un-married" /> Un-married
                                                    <sf:radiobutton path="donorPersonalInformation.maritalStatus" value="Married" /> Married
                                                    <p><sf:errors path="donorPersonalInformation.maritalStatus" /></p>
                                                </div>                                
                                                <c:set var="occupationHasBindError"><sf:errors path="donorPersonalInformation.occupation"/></c:set>
                                                <div class="form-group <c:if test="${!empty occupationHasBindError}" > has-error </c:if> ">
                                                    <sf:label path="donorPersonalInformation.occupation" cssClass="control-label">Occupation</sf:label>
                                                    <sf:input path="donorPersonalInformation.occupation" cssClass="form-control" palceholder="Occupation" />
                                                    <p><sf:errors path="donorPersonalInformation.occupation" /></p>
                                                </div>                                
                                                <c:set var="addressHasBindError"><sf:errors path="donorPersonalInformation.address"/></c:set>
                                                <div class="form-group <c:if test="${!empty addressHasBindError}" > has-error </c:if> ">
                                                    <sf:label path="donorPersonalInformation.address" cssClass="control-label">Address</sf:label>
                                                    <sf:textarea path="donorPersonalInformation.address" cssClass="form-control" palceholder="Address" />
                                                    <p><sf:errors path="donorPersonalInformation.address" /></p>
                                                </div> 
                                            </div>
                                        </div>
                                        <div id="historyOfPreviousDonationTab" class="tab-pane">
                                            <div class="panel-body">
                                                <c:set var="donationStatusHasBindError"><sf:errors path="donorPreviousDonationHistory.donationStatus"/></c:set>
                                                <div class="form-group <c:if test="${!empty donationStatusHasBindError}" > has-error </c:if> ">
                                                    <sf:label path="donorPreviousDonationHistory.donationStatus" cssClass="control-label">Have You Donated Before :</sf:label>
                                                    <sf:radiobutton path="donorPreviousDonationHistory.donationStatus" value="No" checked="checked" /> No
                                                    <sf:radiobutton path="donorPreviousDonationHistory.donationStatus" value="Yes" /> Yes
                                                    <p><sf:errors path="donorPreviousDonationHistory.donationStatus" /></p>
                                                </div>
                                                <c:set var="donationDateHasBindError"><sf:errors path="donorPreviousDonationHistory.donationDate"/></c:set>
                                                <div class="form-group <c:if test="${!empty donationDateHasBindError}" > has-error </c:if> ">
                                                    <sf:label path="donorPreviousDonationHistory.donationDate" cssClass="control-label">Donation Date</sf:label>
                                                    <sf:input path="donorPreviousDonationHistory.donationDate" cssClass="form-control" palceholder="Donation Date" />
                                                    <p><sf:errors path="donorPreviousDonationHistory.donationDate" /></p>
                                                </div> 
                                                <c:set var="donationPlaceHasBindError"><sf:errors path="donorPreviousDonationHistory.donationPlace"/></c:set>
                                                <div class="form-group <c:if test="${!empty donationPlaceHasBindError}" > has-error </c:if> ">
                                                    <sf:label path="donorPreviousDonationHistory.donationPlace" cssClass="control-label">Donation Place</sf:label>
                                                    <sf:input path="donorPreviousDonationHistory.donationPlace" cssClass="form-control" palceholder="Donation Place" />
                                                    <p><sf:errors path="donorPreviousDonationHistory.donationPlace" /></p>
                                                </div> 
                                                <c:set var="anyAdverseReactionHasBindError"><sf:errors path="donorPreviousDonationHistory.anyAdverseReaction"/></c:set>
                                                <div class="form-group <c:if test="${!empty anyAdverseReactionHasBindError}" > has-error </c:if> ">
                                                    <sf:label path="donorPreviousDonationHistory.anyAdverseReaction" cssClass="control-label">Any Adverse Reaction :</sf:label>
                                                    <sf:radiobutton path="donorPreviousDonationHistory.anyAdverseReaction" value="No" checked="checked" /> No
                                                    <sf:radiobutton path="donorPreviousDonationHistory.anyAdverseReaction" value="Yes" /> Yes
                                                    <p><sf:errors path="donorPreviousDonationHistory.anyAdverseReaction" /></p>
                                                </div>
                                                <c:set var="reactionDetailHasBindError"><sf:errors path="donorPreviousDonationHistory.reactionDetail"/></c:set>
                                                <div class="form-group <c:if test="${!empty reactionDetailHasBindError}" > has-error </c:if> ">
                                                    <sf:label path="donorPreviousDonationHistory.reactionDetail" cssClass="control-label">Re-action Detail</sf:label>
                                                    <sf:textarea path="donorPreviousDonationHistory.reactionDetail" cssClass="form-control" palceholder="" />
                                                    <p><sf:errors path="donorPreviousDonationHistory.reactionDetail" /></p>
                                                </div> 
                                                <script>

                                                </script>
                                            </div>
                                        </div>
                                        <div id="healthRelatedInfoTab" class="tab-pane">
                                            <div class="panel-body">
                                                <c:set var="hemoglobinHasBindError"><sf:errors path="donorHealthRelatedInformation.hemoglobin"/></c:set>
                                                <div class="form-group <c:if test="${!empty hemoglobinHasBindError}" > has-error </c:if> ">
                                                    <sf:label path="donorHealthRelatedInformation.hemoglobin" cssClass="control-label">Hemoglobin</sf:label>
                                                    <sf:input path="donorHealthRelatedInformation.hemoglobin" cssClass="form-control" palceholder="Hemoglobin" />
                                                    <p><sf:errors path="donorHealthRelatedInformation.hemoglobin" /></p>
                                                </div>
                                                <c:set var="weightHasBindError"><sf:errors path="donorHealthRelatedInformation.weight"/></c:set>
                                                <div class="form-group <c:if test="${!empty weightHasBindError}" > has-error </c:if> ">
                                                    <sf:label path="donorHealthRelatedInformation.weight" cssClass="control-label">Weight</sf:label>
                                                    <sf:input path="donorHealthRelatedInformation.weight" cssClass="form-control" palceholder="Weight" />
                                                    <p><sf:errors path="donorHealthRelatedInformation.weight" /></p>
                                                </div>
                                                <c:set var="heightHasBindError"><sf:errors path="donorHealthRelatedInformation.height"/></c:set>
                                                <div class="form-group <c:if test="${!empty heightHasBindError}" > has-error </c:if> ">
                                                    <sf:label path="donorHealthRelatedInformation.height" cssClass="control-label">Height</sf:label>
                                                    <sf:input path="donorHealthRelatedInformation.height" cssClass="form-control" palceholder="Height" />
                                                    <p><sf:errors path="donorHealthRelatedInformation.height" /></p>
                                                </div>
                                                <c:set var="temperatureHasBindError"><sf:errors path="donorHealthRelatedInformation.temperature"/></c:set>
                                                <div class="form-group <c:if test="${!empty temperatureHasBindError}" > has-error </c:if> ">
                                                    <sf:label path="donorHealthRelatedInformation.temperature" cssClass="control-label">Temperature</sf:label>
                                                    <sf:input path="donorHealthRelatedInformation.temperature" cssClass="form-control" palceholder="Temperature" />
                                                    <p><sf:errors path="donorHealthRelatedInformation.temperature" /></p>
                                                </div>
                                                <c:set var="pulseHasBindError"><sf:errors path="donorHealthRelatedInformation.pulse"/></c:set>
                                                <div class="form-group <c:if test="${!empty pulseHasBindError}" > has-error </c:if> ">
                                                    <sf:label path="donorHealthRelatedInformation.pulse" cssClass="control-label">Pulse</sf:label>
                                                    <sf:input path="donorHealthRelatedInformation.pulse" cssClass="form-control" palceholder="Pulse" />
                                                    <p><sf:errors path="donorHealthRelatedInformation.pulse" /></p>
                                                </div>
                                                <c:set var="bloodSugarLevelHasBindError"><sf:errors path="donorHealthRelatedInformation.bloodSugarLevel"/></c:set>
                                                <div class="form-group <c:if test="${!empty bloodSugarLevelHasBindError}" > has-error </c:if> ">
                                                    <sf:label path="donorHealthRelatedInformation.bloodSugarLevel" cssClass="control-label">Blood Sugar Level</sf:label>
                                                    <sf:input path="donorHealthRelatedInformation.bloodSugarLevel" cssClass="form-control" palceholder="Blood Sugar Level" />
                                                    <p><sf:errors path="donorHealthRelatedInformation.bloodSugarLevel" /></p>
                                                </div>
                                                <c:set var="bloodPressureHasBindError"><sf:errors path="donorHealthRelatedInformation.bloodPressure"/></c:set>
                                                <div class="form-group <c:if test="${!empty bloodPressureHasBindError}" > has-error </c:if> ">
                                                    <sf:label path="donorHealthRelatedInformation.bloodPressure" cssClass="control-label">Blood Pressure</sf:label>
                                                    <sf:input path="donorHealthRelatedInformation.bloodPressure" cssClass="form-control" palceholder="Blood Pressure" />
                                                    <p><sf:errors path="donorHealthRelatedInformation.bloodPressure" /></p>
                                                </div> 
                                                <c:set var="respirationRateHasBindError"><sf:errors path="donorHealthRelatedInformation.respirationRate"/></c:set>
                                                <div class="form-group <c:if test="${!empty respirationRateHasBindError}" > has-error </c:if> ">
                                                    <sf:label path="donorHealthRelatedInformation.respirationRate" cssClass="control-label">Respiration Rate</sf:label>
                                                    <sf:input path="donorHealthRelatedInformation.respirationRate" cssClass="form-control" palceholder="Respiration Rate" />
                                                    <p><sf:errors path="donorHealthRelatedInformation.respirationRate" /></p>
                                                </div>
                                                <c:set var="bloodGroupABORhesusDHasBindError"><sf:errors path="donorHealthRelatedInformation.bloodGroupABORhesusD"/></c:set>
                                                <div class="form-group <c:if test="${!empty bloodGroupABORhesusDHasBindError}" > has-error </c:if> ">
                                                    <sf:label path="donorHealthRelatedInformation.bloodGroupABORhesusD" cssClass="control-label">Blood Group ABO Rhesus (D)</sf:label>
                                                    <sf:input path="donorHealthRelatedInformation.bloodGroupABORhesusD" cssClass="form-control" palceholder="Blood Group ABO Rhesus (D)" />
                                                    <p><sf:errors path="donorHealthRelatedInformation.bloodGroupABORhesusD" /></p>
                                                </div>        
                                            </div>
                                        </div>
                                        <div id="donorTypeAndConsentTab" class="tab-pane">
                                            <div class="panel-body">
                                                <strong>Donor Type And Consent</strong>
                                                <hr/>
                                                <c:set var="donorTypeHasBindError"><sf:errors path="donorTypeAndConsent.donorType"/></c:set>
                                                <div class="form-group <c:if test="${!empty donorTypeHasBindError}" > has-error </c:if> ">
                                                    <sf:label path="donorTypeAndConsent.donorType" cssClass="control-label">Type</sf:label>
                                                    <sf:select path="donorTypeAndConsent.donorType" cssClass="form-control" >
                                                        <sf:option value="">Select type</sf:option>
                                                        <sf:option value="First Time"></sf:option>
                                                        <sf:option value="Voluntary"></sf:option>
                                                        <sf:option value="Regular"></sf:option>
                                                        <sf:option value="Directed"></sf:option>
                                                    </sf:select>
                                                    <p><sf:errors path="donorTypeAndConsent.donorType" /></p>
                                                </div>
                                                <c:set var="donorConsentHasBindError"><sf:errors path="donorTypeAndConsent.donorConsent"/></c:set>
                                                <div class="form-group <c:if test="${!empty donorConsentHasBindError}" > has-error </c:if> ">
                                                    <sf:label path="donorTypeAndConsent.donorConsent" cssClass="control-label">Consent</sf:label>
                                                    <sf:textarea path="donorTypeAndConsent.donorConsent" cssClass="form-control" palceholder="" />
                                                    <p><sf:errors path="donorTypeAndConsent.donorConsent" /></p>
                                                </div>
                                            </div>
                                        </div>
                                        <div id="transfusionClottingFactorHistoryTab" class="tab-pane">
                                            <div class="panel-body">
                                                <strong>Transfusion Clotting Factor History</strong>
                                                <hr/>
                                                <c:set var="clottingHistoryHasBindError"><sf:errors path="donorTransfusionClottingFactory.clottingHistory"/></c:set>
                                                <div class="form-group <c:if test="${!empty clottingHistoryHasBindError}" > has-error </c:if> ">
                                                    <sf:textarea path="donorTransfusionClottingFactory.clottingHistory" cssClass="form-control" palceholder="" />
                                                    <p><sf:errors path="donorTransfusionClottingFactory.clottingHistory" /></p>
                                                </div>
                                            </div>
                                        </div>
                                        <div id="historyTab" class="tab-pane">
                                            <div class="panel-body">
                                                <strong>History</strong>
                                                <hr/>
                                                <c:set var="recentVaccinationStatusHasBindError"><sf:errors path="donorHistory.recentVaccinationStatus"/></c:set>
                                                <div class="form-group <c:if test="${!empty recentVaccinationStatusHasBindError}" > has-error </c:if> ">
                                                    <sf:label path="donorHistory.recentVaccinationStatus" >Recently Vaccinated :</sf:label>
                                                    <sf:radiobutton path="donorHistory.recentVaccinationStatus" value="No" checked="checked" /> No
                                                    <sf:radiobutton path="donorHistory.recentVaccinationStatus" value="Yes" /> Yes
                                                    <p><sf:errors path="donorHistory.recentVaccinationStatus" /></p>
                                                </div>
                                                <c:set var="recfentSurgeryStatusHasBindError"><sf:errors path="donorHistory.recfentSurgeryStatus"/></c:set>
                                                <div class="form-group <c:if test="${!empty recfentSurgeryStatusHasBindError}" > has-error </c:if> ">
                                                    <sf:label path="donorHistory.recfentSurgeryStatus" >Recently Surgery (In 4 weeks) :</sf:label>
                                                    <sf:radiobutton path="donorHistory.recfentSurgeryStatus" value="No" checked="checked" /> No
                                                    <sf:radiobutton path="donorHistory.recfentSurgeryStatus" value="Yes" /> Yes
                                                    <p><sf:errors path="donorHistory.recfentSurgeryStatus" /></p>
                                                </div>
                                                <c:set var="recentToothExtractionHasBindError"><sf:errors path="donorHistory.recentToothExtraction"/></c:set>
                                                <div class="form-group <c:if test="${!empty recentToothExtractionHasBindError}" > has-error </c:if> ">
                                                    <sf:label path="donorHistory.recentToothExtraction" >Recent Tooth Extraction (In 4 weeks) :</sf:label>
                                                    <sf:radiobutton path="donorHistory.recentToothExtraction" value="No" checked="checked" /> No
                                                    <sf:radiobutton path="donorHistory.recentToothExtraction" value="Yes" /> Yes
                                                    <p><sf:errors path="donorHistory.recentToothExtraction" /></p>
                                                </div>
                                                <c:set var="typhoidStatusHasBindError"><sf:errors path="donorHistory.typhoidStatus"/></c:set>
                                                <div class="form-group <c:if test="${!empty typhoidStatusHasBindError}" > has-error </c:if> ">
                                                    <sf:label path="donorHistory.typhoidStatus" >Typhoid :</sf:label>
                                                    <sf:radiobutton path="donorHistory.typhoidStatus" value="No" checked="checked" /> No
                                                    <sf:radiobutton path="donorHistory.typhoidStatus" value="Yes" /> Yes
                                                    <p><sf:errors path="donorHistory.typhoidStatus" /></p>
                                                </div>
                                                <c:set var="arthritisFeverStatusHasBindError"><sf:errors path="donorHistory.arthritisFeverStatus"/></c:set>
                                                <div class="form-group <c:if test="${!empty arthritisFeverStatusHasBindError}" > has-error </c:if> ">
                                                    <sf:label path="donorHistory.arthritisFeverStatus" >Arthritis Fever :</sf:label>
                                                    <sf:radiobutton path="donorHistory.arthritisFeverStatus" value="No" checked="checked" /> No
                                                    <sf:radiobutton path="donorHistory.arthritisFeverStatus" value="Yes" /> Yes
                                                    <p><sf:errors path="donorHistory.arthritisFeverStatus" /></p>
                                                </div>
                                                <c:set var="dasaphilisaStatusHasBindError"><sf:errors path="donorHistory.dasaphilisaStatus"/></c:set>
                                                <div class="form-group <c:if test="${!empty dasaphilisaStatusHasBindError}" > has-error </c:if> ">
                                                    <sf:label path="donorHistory.dasaphilisaStatus" >Dasaphilisa :</sf:label>
                                                    <sf:radiobutton path="donorHistory.dasaphilisaStatus" value="No" checked="checked" /> No
                                                    <sf:radiobutton path="donorHistory.dasaphilisaStatus" value="Yes" /> Yes
                                                    <p><sf:errors path="donorHistory.dasaphilisaStatus" /></p>
                                                </div>
                                                <c:set var="shigellosisStatusHasBindError"><sf:errors path="donorHistory.shigellosisStatus"/></c:set>
                                                <div class="form-group <c:if test="${!empty shigellosisStatusHasBindError}" > has-error </c:if> ">
                                                    <sf:label path="donorHistory.shigellosisStatus" >Shigellosis :</sf:label>
                                                    <sf:radiobutton path="donorHistory.shigellosisStatus" value="No" checked="checked" /> No
                                                    <sf:radiobutton path="donorHistory.shigellosisStatus" value="Yes" /> Yes
                                                    <p><sf:errors path="donorHistory.shigellosisStatus" /></p>
                                                </div>
                                                <c:set var="bloodDisordersStatusHasBindError"><sf:errors path="donorHistory.bloodDisordersStatus"/></c:set>
                                                <div class="form-group <c:if test="${!empty bloodDisordersStatusHasBindError}" > has-error </c:if> ">
                                                    <sf:label path="donorHistory.bloodDisordersStatus" >Blood Disorders :</sf:label>
                                                    <sf:radiobutton path="donorHistory.bloodDisordersStatus" value="No" checked="checked" /> No
                                                    <sf:radiobutton path="donorHistory.bloodDisordersStatus" value="Yes" /> Yes
                                                    <p><sf:errors path="donorHistory.bloodDisordersStatus" /></p>
                                                </div>
                                                <c:set var="anadulentaFeverStatusHasBindError"><sf:errors path="donorHistory.anadulentaFeverStatus"/></c:set>
                                                <div class="form-group <c:if test="${!empty anadulentaFeverStatusHasBindError}" > has-error </c:if> ">
                                                    <sf:label path="donorHistory.anadulentaFeverStatus" >Anadulenta Fever :</sf:label>
                                                    <sf:radiobutton path="donorHistory.anadulentaFeverStatus" value="No" checked="checked" /> No
                                                    <sf:radiobutton path="donorHistory.anadulentaFeverStatus" value="Yes" /> Yes
                                                    <p><sf:errors path="donorHistory.anadulentaFeverStatus" /></p>
                                                </div>
                                                <c:set var="mijilasaOrMumpsStatusHasBindError"><sf:errors path="donorHistory.mijilasaOrMumpsStatus"/></c:set>
                                                <div class="form-group <c:if test="${!empty mijilasaOrMumpsStatusHasBindError}" > has-error </c:if> ">
                                                    <sf:label path="donorHistory.mijilasaOrMumpsStatus" >Mijilasa/Mumps :</sf:label>
                                                    <sf:radiobutton path="donorHistory.mijilasaOrMumpsStatus" value="No" checked="checked" /> No
                                                    <sf:radiobutton path="donorHistory.mijilasaOrMumpsStatus" value="Yes" /> Yes
                                                    <p><sf:errors path="donorHistory.mijilasaOrMumpsStatus" /></p>
                                                </div>
                                                <c:set var="recentWeightReductionStatusHasBindError"><sf:errors path="donorHistory.recentWeightReductionStatus"/></c:set>
                                                <div class="form-group <c:if test="${!empty recentWeightReductionStatusHasBindError}" > has-error </c:if> ">
                                                    <sf:label path="donorHistory.recentWeightReductionStatus" >Recent Weight Reduction :</sf:label>
                                                    <sf:radiobutton path="donorHistory.recentWeightReductionStatus" value="No" checked="checked" /> No
                                                    <sf:radiobutton path="donorHistory.recentWeightReductionStatus" value="Yes" /> Yes
                                                    <p><sf:errors path="donorHistory.recentWeightReductionStatus" /></p>
                                                </div>
                                            </div>
                                        </div>
                                        <div id="sufferingTab" class="tab-pane">
                                            <div class="panel-body">
                                                <strong>Sufferings</strong>
                                                <hr/>
                                                <c:set var="hepatitisHasBindError"><sf:errors path="donorSufferingHistory.hepatitis"/></c:set>
                                                <div class="form-group <c:if test="${!empty hepatitisHasBindError}" > has-error </c:if> ">
                                                    <sf:label path="donorSufferingHistory.hepatitis" >Hepatitis :</sf:label>
                                                    <sf:radiobutton path="donorSufferingHistory.hepatitis" value="No" checked="checked" /> No
                                                    <sf:radiobutton path="donorSufferingHistory.hepatitis" value="Yes" /> Yes
                                                    <p><sf:errors path="donorSufferingHistory.hepatitis" /></p>
                                                </div>
                                                <c:set var="jaundiceHasBindError"><sf:errors path="donorSufferingHistory.jaundice"/></c:set>
                                                <div class="form-group <c:if test="${!empty jaundiceHasBindError}" > has-error </c:if> ">
                                                    <sf:label path="donorSufferingHistory.jaundice" >Jaundice :</sf:label>
                                                    <sf:radiobutton path="donorSufferingHistory.jaundice" value="No" checked="checked" /> No
                                                    <sf:radiobutton path="donorSufferingHistory.jaundice" value="Yes" /> Yes
                                                    <p><sf:errors path="donorSufferingHistory.jaundice" /></p>
                                                </div>
                                                <c:set var="malariaHasBindError"><sf:errors path="donorSufferingHistory.malaria"/></c:set>
                                                <div class="form-group <c:if test="${!empty malariaHasBindError}" > has-error </c:if> ">
                                                    <sf:label path="donorSufferingHistory.malaria" >Malaria :</sf:label>
                                                    <sf:radiobutton path="donorSufferingHistory.malaria" value="No" checked="checked" /> No
                                                    <sf:radiobutton path="donorSufferingHistory.malaria" value="Yes" /> Yes
                                                    <p><sf:errors path="donorSufferingHistory.malaria" /></p>
                                                </div>
                                                <c:set var="epilepsyHasBindError"><sf:errors path="donorSufferingHistory.epilepsy"/></c:set>
                                                <div class="form-group <c:if test="${!empty epilepsyHasBindError}" > has-error </c:if> ">
                                                    <sf:label path="donorSufferingHistory.epilepsy" >Epilepsy :</sf:label>
                                                    <sf:radiobutton path="donorSufferingHistory.epilepsy" value="No" checked="checked" /> No
                                                    <sf:radiobutton path="donorSufferingHistory.epilepsy" value="Yes" /> Yes
                                                    <p><sf:errors path="donorSufferingHistory.epilepsy" /></p>
                                                </div>
                                                <c:set var="heartDiseaseHasBindError"><sf:errors path="donorSufferingHistory.heartDisease"/></c:set>
                                                <div class="form-group <c:if test="${!empty heartDiseaseHasBindError}" > has-error </c:if> ">
                                                    <sf:label path="donorSufferingHistory.heartDisease" >Heart Disease :</sf:label>
                                                    <sf:radiobutton path="donorSufferingHistory.heartDisease" value="No" checked="checked" /> No
                                                    <sf:radiobutton path="donorSufferingHistory.heartDisease" value="Yes" /> Yes
                                                    <p><sf:errors path="donorSufferingHistory.heartDisease" /></p>
                                                </div>
                                                <c:set var="diabetesHasBindError"><sf:errors path="donorSufferingHistory.diabetes"/></c:set>
                                                <div class="form-group <c:if test="${!empty diabetesHasBindError}" > has-error </c:if> ">
                                                    <sf:label path="donorSufferingHistory.diabetes" >Diabetes :</sf:label>
                                                    <sf:radiobutton path="donorSufferingHistory.diabetes" value="No" checked="checked" /> No
                                                    <sf:radiobutton path="donorSufferingHistory.diabetes" value="Yes" /> Yes
                                                    <p><sf:errors path="donorSufferingHistory.diabetes" /></p>
                                                </div>
                                                <c:set var="sexualDiseaseHasBindError"><sf:errors path="donorSufferingHistory.sexualDisease"/></c:set>
                                                <div class="form-group <c:if test="${!empty sexualDiseaseHasBindError}" > has-error </c:if> ">
                                                    <sf:label path="donorSufferingHistory.sexualDisease" >Sexual Disease :</sf:label>
                                                    <sf:radiobutton path="donorSufferingHistory.sexualDisease" value="No" checked="checked" /> No
                                                    <sf:radiobutton path="donorSufferingHistory.sexualDisease" value="Yes" /> Yes
                                                    <p><sf:errors path="donorSufferingHistory.sexualDisease" /></p>
                                                </div>
                                                <c:set var="asthmaHasBindError"><sf:errors path="donorSufferingHistory.asthma"/></c:set>
                                                <div class="form-group <c:if test="${!empty asthmaHasBindError}" > has-error </c:if> ">
                                                    <sf:label path="donorSufferingHistory.asthma" >Asthma :</sf:label>
                                                    <sf:radiobutton path="donorSufferingHistory.asthma" value="No" checked="checked" /> No
                                                    <sf:radiobutton path="donorSufferingHistory.asthma" value="Yes" /> Yes
                                                    <p><sf:errors path="donorSufferingHistory.asthma" /></p>
                                                </div>
                                                <c:set var="eczemaHasBindError"><sf:errors path="donorSufferingHistory.eczema"/></c:set>
                                                <div class="form-group <c:if test="${!empty eczemaHasBindError}" > has-error </c:if> ">
                                                    <sf:label path="donorSufferingHistory.eczema" >Eczema :</sf:label>
                                                    <sf:radiobutton path="donorSufferingHistory.eczema" value="No" checked="checked" /> No
                                                    <sf:radiobutton path="donorSufferingHistory.eczema" value="Yes" /> Yes
                                                    <p><sf:errors path="donorSufferingHistory.eczema" /></p>
                                                </div>
                                                <c:set var="highBloodPressureHasBindError"><sf:errors path="donorSufferingHistory.highBloodPressure"/></c:set>
                                                <div class="form-group <c:if test="${!empty highBloodPressureHasBindError}" > has-error </c:if> ">
                                                    <sf:label path="donorSufferingHistory.highBloodPressure" >High Blood Pressure :</sf:label>
                                                    <sf:radiobutton path="donorSufferingHistory.highBloodPressure" value="No" checked="checked" /> No
                                                    <sf:radiobutton path="donorSufferingHistory.highBloodPressure" value="Yes" /> Yes
                                                    <p><sf:errors path="donorSufferingHistory.highBloodPressure" /></p>
                                                </div>
                                                <c:set var="kidneyDiseaseHasBindError"><sf:errors path="donorSufferingHistory.kidneyDisease"/></c:set>
                                                <div class="form-group <c:if test="${!empty kidneyDiseaseHasBindError}" > has-error </c:if> ">
                                                    <sf:label path="donorSufferingHistory.kidneyDisease" >Kidney Disease :</sf:label>
                                                    <sf:radiobutton path="donorSufferingHistory.kidneyDisease" value="No" checked="checked" /> No
                                                    <sf:radiobutton path="donorSufferingHistory.kidneyDisease" value="Yes" /> Yes
                                                    <p><sf:errors path="donorSufferingHistory.kidneyDisease" /></p>
                                                </div>
                                                <c:set var="tvHasBindError"><sf:errors path="donorSufferingHistory.tv"/></c:set>
                                                <div class="form-group <c:if test="${!empty tvHasBindError}" > has-error </c:if> ">
                                                    <sf:label path="donorSufferingHistory.tv" >TV :</sf:label>
                                                    <sf:radiobutton path="donorSufferingHistory.tv" value="No" checked="checked" /> No
                                                    <sf:radiobutton path="donorSufferingHistory.tv" value="Yes" /> Yes
                                                    <p><sf:errors path="donorSufferingHistory.tv" /></p>
                                                </div>
                                                <c:set var="hivHasBindError"><sf:errors path="donorSufferingHistory.hiv"/></c:set>
                                                <div class="form-group <c:if test="${!empty hivHasBindError}" > has-error </c:if> ">
                                                    <sf:label path="donorSufferingHistory.hiv" >HIV :</sf:label>
                                                    <sf:radiobutton path="donorSufferingHistory.hiv" value="No" checked="checked" /> No
                                                    <sf:radiobutton path="donorSufferingHistory.hiv" value="Yes" /> Yes
                                                    <p><sf:errors path="donorSufferingHistory.hiv" /></p>
                                                </div>
                                                <c:set var="pylosHasBindError"><sf:errors path="donorSufferingHistory.pylos"/></c:set>
                                                <div class="form-group <c:if test="${!empty pylosHasBindError}" > has-error </c:if> ">
                                                    <sf:label path="donorSufferingHistory.pylos" >Pylos :</sf:label>
                                                    <sf:radiobutton path="donorSufferingHistory.pylos" value="No" checked="checked" /> No
                                                    <sf:radiobutton path="donorSufferingHistory.pylos" value="Yes" /> Yes
                                                    <p><sf:errors path="donorSufferingHistory.pylos" /></p>
                                                </div>
                                                <c:set var="cancerHasBindError"><sf:errors path="donorSufferingHistory.cancer"/></c:set>
                                                <div class="form-group <c:if test="${!empty cancerHasBindError}" > has-error </c:if> ">
                                                    <sf:label path="donorSufferingHistory.cancer" >Cancer :</sf:label>
                                                    <sf:radiobutton path="donorSufferingHistory.cancer" value="No" checked="checked" /> No
                                                    <sf:radiobutton path="donorSufferingHistory.cancer" value="Yes" /> Yes
                                                    <p><sf:errors path="donorSufferingHistory.cancer" /></p>
                                                </div>
                                                <c:set var="pepticUlcerHasBindError"><sf:errors path="donorSufferingHistory.pepticUlcer"/></c:set>
                                                <div class="form-group <c:if test="${!empty pepticUlcerHasBindError}" > has-error </c:if> ">
                                                    <sf:label path="donorSufferingHistory.pepticUlcer" >Peptic Ulcer :</sf:label>
                                                    <sf:radiobutton path="donorSufferingHistory.pepticUlcer" value="No" checked="checked" /> No
                                                    <sf:radiobutton path="donorSufferingHistory.pepticUlcer" value="Yes" /> Yes
                                                    <p><sf:errors path="donorSufferingHistory.pepticUlcer" /></p>
                                                </div>
                                                <c:set var="lungDiseaseHasBindError"><sf:errors path="donorSufferingHistory.lungDisease"/></c:set>
                                                <div class="form-group <c:if test="${!empty lungDiseaseHasBindError}" > has-error </c:if> ">
                                                    <sf:label path="donorSufferingHistory.lungDisease" >Lung Disease :</sf:label>
                                                    <sf:radiobutton path="donorSufferingHistory.lungDisease" value="No" checked="checked" /> No
                                                    <sf:radiobutton path="donorSufferingHistory.lungDisease" value="Yes" /> Yes
                                                    <p><sf:errors path="donorSufferingHistory.lungDisease" /></p>
                                                </div>
                                                <c:set var="liverDiseaseHasBindError"><sf:errors path="donorSufferingHistory.liverDisease"/></c:set>
                                                <div class="form-group <c:if test="${!empty liverDiseaseHasBindError}" > has-error </c:if> ">
                                                    <sf:label path="donorSufferingHistory.liverDisease" >Liver Disease :</sf:label>
                                                    <sf:radiobutton path="donorSufferingHistory.liverDisease" value="No" checked="checked" /> No
                                                    <sf:radiobutton path="donorSufferingHistory.liverDisease" value="Yes" /> Yes
                                                    <p><sf:errors path="donorSufferingHistory.liverDisease" /></p>
                                                </div>
                                            </div>
                                        </div>
                                        <div id="questionTab" class="tab-pane">
                                            <div class="panel-body">
                                                <strong>Questions</strong>
                                                <hr/>
                                                <c:set var="hasTakenBloodElementHasBindError"><sf:errors path="questions.hasTakenBloodElement"/></c:set>
                                                <div class="form-group <c:if test="${!empty hasTakenBloodElementHasBindError}" > has-error </c:if> ">
                                                    <sf:label path="questions.hasTakenBloodElement" >Has Taken Any Blood Element :</sf:label>
                                                    <sf:radiobutton path="questions.hasTakenBloodElement" value="No" checked="checked" /> No
                                                    <sf:radiobutton path="questions.hasTakenBloodElement" value="Yes" /> Yes
                                                    <p><sf:errors path="questions.hasTakenBloodElement" /></p>
                                                </div>
                                               <c:set var="hasTakenAspirinHasBindError"><sf:errors path="questions.hasTakenAspirin"/></c:set>
                                                <div class="form-group <c:if test="${!empty hasTakenAspirinHasBindError}" > has-error </c:if> ">
                                                    <sf:label path="questions.hasTakenAspirin" >Has Taken Aspirin :</sf:label>
                                                    <sf:radiobutton path="questions.hasTakenAspirin" value="No" checked="checked" /> No
                                                    <sf:radiobutton path="questions.hasTakenAspirin" value="Yes" /> Yes
                                                    <p><sf:errors path="questions.hasTakenAspirin" /></p>
                                                </div>
                                                <c:set var="drugAddictedHasBindError"><sf:errors path="questions.drugAddicted"/></c:set>
                                                <div class="form-group <c:if test="${!empty drugAddictedHasBindError}" > has-error </c:if> ">
                                                    <sf:label path="questions.drugAddicted" >Drug Addicted :</sf:label>
                                                    <sf:radiobutton path="questions.drugAddicted" value="No" checked="checked" /> No
                                                    <sf:radiobutton path="questions.drugAddicted" value="Yes" /> Yes
                                                    <p><sf:errors path="questions.drugAddicted" /></p>
                                                </div>
                                                <c:set var="hasTakenAnyDrugHasBindError"><sf:errors path="questions.hasTakenAnyDrug"/></c:set>
                                                <div class="form-group <c:if test="${!empty hasTakenAnyDrugHasBindError}" > has-error </c:if> ">
                                                    <sf:label path="questions.hasTakenAnyDrug" >Has Taken Any Drug :</sf:label>
                                                    <sf:radiobutton path="questions.hasTakenAnyDrug" value="No" checked="checked" /> No
                                                    <sf:radiobutton path="questions.hasTakenAnyDrug" value="Yes" /> Yes
                                                    <p><sf:errors path="questions.hasTakenAnyDrug" /></p>
                                                </div>
                                                <c:set var="travelsToForeignHasBindError"><sf:errors path="questions.travelsToForeign"/></c:set>
                                                <div class="form-group <c:if test="${!empty travelsToForeignHasBindError}" > has-error </c:if> ">
                                                    <sf:label path="questions.travelsToForeign" >Do You Travel To Foreign :</sf:label>
                                                    <sf:radiobutton path="questions.travelsToForeign" value="No" checked="checked" /> No
                                                    <sf:radiobutton path="questions.travelsToForeign" value="Yes" /> Yes
                                                    <p><sf:errors path="questions.travelsToForeign" /></p>
                                                </div>
                                                <c:set var="currentlyTakingMedicineHasBindError"><sf:errors path="questions.currentlyTakingMedicine"/></c:set>
                                                <div class="form-group <c:if test="${!empty currentlyTakingMedicineHasBindError}" > has-error </c:if> ">
                                                    <sf:label path="questions.currentlyTakingMedicine" >Currently Taking Any Medicine :</sf:label>
                                                    <sf:radiobutton path="questions.currentlyTakingMedicine" value="No" checked="checked" /> No
                                                    <sf:radiobutton path="questions.currentlyTakingMedicine" value="Yes" /> Yes
                                                    <p><sf:errors path="questions.currentlyTakingMedicine" /></p>
                                                </div>
                                                <c:set var="willingToDonateBloodRegularlyHasBindError"><sf:errors path="questions.willingToDonateBloodRegularly"/></c:set>
                                                <div class="form-group <c:if test="${!empty willingToDonateBloodRegularlyHasBindError}" > has-error </c:if> ">
                                                    <sf:label path="questions.willingToDonateBloodRegularly" >Willing To Donate Blood Regularly :</sf:label>
                                                    <sf:radiobutton path="questions.willingToDonateBloodRegularly" value="No" checked="checked" /> No
                                                    <sf:radiobutton path="questions.willingToDonateBloodRegularly" value="Yes" /> Yes
                                                    <p><sf:errors path="questions.willingToDonateBloodRegularly" /></p>
                                                </div>
                                                <c:set var="fitnessHasBindError"><sf:errors path="questions.fitness"/></c:set>
                                                <div class="form-group <c:if test="${!empty fitnessHasBindError}" > has-error </c:if> ">
                                                    <sf:label path="questions.fitness" >Are You Fit Now :</sf:label>
                                                    <sf:radiobutton path="questions.fitness" value="No" checked="checked" /> No
                                                    <sf:radiobutton path="questions.fitness" value="Yes" /> Yes
                                                    <p><sf:errors path="questions.fitness" /></p>
                                                </div>
                                                <c:set var="hasTakenFoodHasBindError"><sf:errors path="questions.hasTakenFood"/></c:set>
                                                <div class="form-group <c:if test="${!empty hasTakenFoodHasBindError}" > has-error </c:if> ">
                                                    <sf:label path="questions.hasTakenFood" >Have You Taken Your Food :</sf:label>
                                                    <sf:radiobutton path="questions.hasTakenFood" value="No" checked="checked" /> No
                                                    <sf:radiobutton path="questions.hasTakenFood" value="Yes" /> Yes
                                                    <p><sf:errors path="questions.hasTakenFood" /></p>
                                                </div>
                                                <c:set var="acupunctureHasBindError"><sf:errors path="questions.acupuncture"/></c:set>
                                                <div class="form-group <c:if test="${!empty acupunctureHasBindError}" > has-error </c:if> ">
                                                    <sf:label path="questions.acupuncture" >Acupuncture :</sf:label>
                                                    <sf:radiobutton path="questions.acupuncture" value="No" checked="checked" /> No
                                                    <sf:radiobutton path="questions.acupuncture" value="Yes" /> Yes
                                                    <p><sf:errors path="questions.acupuncture" /></p>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="form-group" style="margin-top: 10px;">
                            <div class="col-lg-offset-2 col-lg-9">
                                <button class="btn btn-sm btn-info" type="submit">Save Donor</button>
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