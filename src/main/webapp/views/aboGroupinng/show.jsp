<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="sf" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="s"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<div class="row">
    <div class="col-lg-12">
        <div class="ibox float-e-margins">
            <div class="ibox-title">
                <h5>Donor Detail</h5>
                <div class="ibox-tools">
                    <a href="<c:url value="/admin/donor/add-new-donor" />">
                        <span class="label label-primary pull-right">
                            <i class="fa fa-user"></i> NEW
                        </span>
                    </a>
                </div>
            </div>
            <div class="ibox-content">
                <div class="row">
                    <div class="col-lg-6">
                        <table class="table">
                            <thead>
                                <tr>
                                    <th>Personal Information</th>
                                    <th></th>
                                </tr>
                            </thead>
                            <tbody>
                                <tr>
                                    <td>Full Name</td>
                                    <td>${donor.fullName}</td>
                                </tr>
                                <tr>
                                    <td>ID Number</td>
                                    <td>${donor.idNumber}</td>
                                </tr>
                                <tr>
                                    <td>Age</td>
                                    <td>${donor.age}</td>
                                </tr>
                                <tr>
                                    <td>Gender</td>
                                    <td>${donor.sex}</td>
                                </tr>
                                <tr>
                                    <td>Phone Number</td>
                                    <td>${donor.phoneNumber}</td>
                                </tr>
                                <tr>
                                    <td>Mobile Number</td>
                                    <td>${donor.mobileNumber}</td>
                                </tr>
                                <tr>
                                    <td>Email</td>
                                    <td>${donor.email}</td>
                                </tr>
                                <tr>
                                    <td>Marital Status</td>
                                    <td>${donor.maritalStatus}</td>
                                </tr>
                                <tr>
                                    <td>Occupation</td>
                                    <td>${donor.occupation}</td>
                                </tr>
                                <tr>
                                    <td>Address</td>
                                    <td>${donor.address}</td>
                                </tr>
                            </tbody>
                        </table>
                        <table class="table">
                            <thead>
                                <tr>
                                    <th>History Of Previous Donation</th>
                                    <th></th>
                                </tr>
                            </thead>
                            <tbody>
                                <tr>
                                    <td>Previous Donation Status</td>
                                    <td>${donor.donorPreviousDonationHistory.donationStatus}</td>
                                </tr>
                                <c:if test="${donor.donorPreviousDonationHistory.donationStatus == 'Yes'}">
                                    <tr>
                                        <td>Previous Donation Date</td>
                                        <td>
                                            ${donor.donorPreviousDonationHistory.donationDate}
                                        </td>
                                    </tr>
                                    <tr>
                                        <td>Previous Donation Place</td>
                                        <td>${donor.donorPreviousDonationHistory.donationPlace}</td>
                                    </tr>
                                    <tr>
                                        <td>Any Adverse Reaction</td>
                                        <td>${donor.donorPreviousDonationHistory.anyAdverseReaction}</td>
                                    </tr>
                                    <c:if test="${donor.donorPreviousDonationHistory.anyAdverseReaction == 'Yes'}">
                                        <tr>
                                            <td>Re-action Detail</td>
                                            <td>${donor.donorPreviousDonationHistory.reactionDetail}</td>
                                        </tr>
                                    </c:if>
                                </c:if>
                            </tbody>
                        </table>        
                        <table class="table">
                            <thead>
                                <tr>
                                    <th>Health Related Information</th>
                                    <th></th>
                                </tr>
                            </thead>
                            <tbody>
                                <tr>
                                    <td>Hemoglobin</td>
                                    <td>${donor.donorHealthRelatedInformation.hemoglobin}</td>
                                </tr>
                                <tr>
                                    <td>Weight</td>
                                    <td>${donor.donorHealthRelatedInformation.weight}</td>
                                </tr>
                                <tr>
                                    <td>Height</td>
                                    <td>${donor.donorHealthRelatedInformation.height}</td>
                                </tr>
                                <tr>
                                    <td>Temperature</td>
                                    <td>${donor.donorHealthRelatedInformation.temperature} (In Farenheit)</td>
                                </tr>
                                <tr>
                                    <td>Pulse</td>
                                    <td>${donor.donorHealthRelatedInformation.pulse}</td>
                                </tr>
                                <tr>
                                    <td>Blood Sugar Level</td>
                                    <td>${donor.donorHealthRelatedInformation.bloodSugarLevel}</td>
                                </tr>
                                <tr>
                                    <td>Blood Pressure</td>
                                    <td>${donor.donorHealthRelatedInformation.bloodPressure}</td>
                                </tr>
                                <tr>
                                    <td>Respiration Rate</td>
                                    <td>${donor.donorHealthRelatedInformation.respirationRate} (Per minute)</td>
                                </tr>
                                <tr>
                                    <td>Blood Group ABO Rhesus (D)</td>
                                    <td>${donor.donorHealthRelatedInformation.bloodGroupABORhesusD}</td>
                                </tr>
                            </tbody>
                        </table>       
                        <table class="table">
                            <thead>
                                <tr>
                                    <th>Donor Type And Consent</th>
                                    <th></th>
                                </tr>
                            </thead>
                            <tbody>
                                <tr>
                                    <td>Donor Type</td>
                                    <td>${donor.donorTypeAndConsent.donorType}</td>
                                </tr>
                                <tr>
                                    <td>Consent</td>
                                    <td>${donor.donorTypeAndConsent.donorConsent}</td>
                                </tr>
                            </tbody>
                        </table>
                        <table class="table">
                            <thead>
                                <tr>
                                    <th>Transfusion Clotting Factor History</th>
                                    <th></th>
                                </tr>
                            </thead>
                            <tbody>
                                <tr>
                                    <td>History</td>
                                    <td>${donor.donorTransfusionClottingFactory.clottingHistory}</td>
                                </tr>
                            </tbody>
                        </table>
                    </div>
                    <div class="col-lg-6">
                        <table class="table">
                            <thead>
                                <tr>
                                    <th>History</th>
                                    <th></th>
                                </tr>
                            </thead>
                            <tbody>
                                <tr>
                                    <td>Recently Vaccinated</td>
                                    <td>${donor.donorHistory.recentVaccinationStatus}</td>
                                </tr>
                                <tr>
                                    <td>Recently Surgery (In 4 weeks)</td>
                                    <td>${donor.donorHistory.recfentSurgeryStatus}</td>
                                </tr>
                                <tr>
                                    <td>Recent Tooth Extraction (In 4 weeks)</td>
                                    <td>${donor.donorHistory.recentToothExtraction}</td>
                                </tr>
                                <tr>
                                    <td>Typhoid</td>
                                    <td>${donor.donorHistory.typhoidStatus}</td>
                                </tr>
                                <tr>
                                    <td>Arthritis Fever</td>
                                    <td>${donor.donorHistory.arthritisFeverStatus}</td>
                                </tr>
                                <tr>
                                    <td>Dasaphilisa</td>
                                    <td>${donor.donorHistory.dasaphilisaStatus}</td>
                                </tr>
                                <tr>
                                    <td>Shigellosis</td>
                                    <td>${donor.donorHistory.shigellosisStatus}</td>
                                </tr>
                                <tr>
                                    <td>Blood Disorders</td>
                                    <td>${donor.donorHistory.bloodDisordersStatus}</td>
                                </tr>
                                <tr>
                                    <td>Anadulenta Fever</td>
                                    <td>${donor.donorHistory.anadulentaFeverStatus}</td>
                                </tr>
                                <tr>
                                    <td>Mijilasa/Mumps</td>
                                    <td>${donor.donorHistory.mijilasaOrMumpsStatus}</td>
                                </tr>
                                <tr>
                                    <td>Recent Weight Reduction</td>
                                    <td>${donor.donorHistory.recentWeightReductionStatus}</td>
                                </tr>
                            </tbody>
                        </table>
                        <table class="table">
                            <thead>
                                <tr>
                                    <th>Sufferings</th>
                                    <th></th>
                                </tr>
                            </thead>
                            <tbody>
                                <tr>
                                    <td>Hepatitis</td>
                                    <td>${donor.donorSufferingHistory.hepatitis}</td>
                                </tr>
                                <tr>
                                    <td>Jaundice</td>
                                    <td>${donor.donorSufferingHistory.jaundice}</td>
                                </tr>
                                <tr>
                                    <td>Malaria</td>
                                    <td>${donor.donorSufferingHistory.malaria}</td>
                                </tr>
                                <tr>
                                    <td>Epilepsy</td>
                                    <td>${donor.donorSufferingHistory.epilepsy}</td>
                                </tr>
                                <tr>
                                    <td>Heart Disease</td>
                                    <td>${donor.donorSufferingHistory.heartDisease}</td>
                                </tr>
                                <tr>
                                    <td>Diabetes</td>
                                    <td>${donor.donorSufferingHistory.diabetes}</td>
                                </tr>
                                <tr>
                                    <td>Sexual Disease</td>
                                    <td>${donor.donorSufferingHistory.sexualDisease}</td>
                                </tr>
                                <tr>
                                    <td>Asthma</td>
                                    <td>${donor.donorSufferingHistory.asthma}</td>
                                </tr>
                                <tr>
                                    <td>Eczema</td>
                                    <td>${donor.donorSufferingHistory.eczema}</td>
                                </tr>
                                <tr>
                                    <td>High Blood Pressure</td>
                                    <td>${donor.donorSufferingHistory.highBloodPressure}</td>
                                </tr>
                                <tr>
                                    <td>Kidney Disease</td>
                                    <td>${donor.donorSufferingHistory.kidneyDisease}</td>
                                </tr>
                                <tr>
                                    <td>TV</td>
                                    <td>${donor.donorSufferingHistory.tv}</td>
                                </tr>
                                <tr>
                                    <td>HIV</td>
                                    <td>${donor.donorSufferingHistory.hiv}</td>
                                </tr>
                                <tr>
                                    <td>Pylos</td>
                                    <td>${donor.donorSufferingHistory.pylos}</td>
                                </tr>
                                <tr>
                                    <td>Cancer</td>
                                    <td>${donor.donorSufferingHistory.cancer}</td>
                                </tr>
                                <tr>
                                    <td>Peptic Ulcer</td>
                                    <td>${donor.donorSufferingHistory.pepticUlcer}</td>
                                </tr>
                                <tr>
                                    <td>Lung Disease</td>
                                    <td>${donor.donorSufferingHistory.lungDisease}</td>
                                </tr>
                                <tr>
                                    <td>Liver Disease</td>
                                    <td>${donor.donorSufferingHistory.liverDisease}</td>
                                </tr>
                        </table>
                        <table class="table">
                            <thead>
                                <tr>
                                    <th>Questions</th>
                                    <th></th>
                                </tr>
                            </thead>
                            <tbody>
                                <tr>
                                    <td>Has Taken Any Blood Element</td>
                                    <td>${donor.questions.hasTakenBloodElement}</td>
                                </tr>
                                <tr>
                                    <td>Has Taken Aspirin</td>
                                    <td>${donor.questions.hasTakenAspirin}</td>
                                </tr>
                                <tr>
                                    <td>Drug Addicted</td>
                                    <td>${donor.questions.drugAddicted}</td>
                                </tr>
                                <tr>
                                    <td>Has Taken Any Drug</td>
                                    <td>${donor.questions.hasTakenAnyDrug}</td>
                                </tr>
                                <tr>
                                    <td>Do You Travel To Foreign</td>
                                    <td>${donor.questions.travelsToForeign}</td>
                                </tr>
                                <tr>
                                    <td>Currently Taking Any Medicine</td>
                                    <td>${donor.questions.currentlyTakingMedicine}</td>
                                </tr>
                                <tr>
                                    <td>Willing To Donate Blood Regularly</td>
                                    <td>${donor.questions.willingToDonateBloodRegularly}</td>
                                </tr>
                                <tr>
                                    <td>Are You Fit Now</td>
                                    <td>${donor.questions.fitness}</td>
                                </tr>
                                <tr>
                                    <td>Have You Taken Your Food</td>
                                    <td>${donor.questions.hasTakenFood}</td>
                                </tr>
                                <tr>
                                    <td>Acupuncture</td>
                                    <td>${donor.questions.acupuncture}</td>
                                </tr>
                        </table>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>