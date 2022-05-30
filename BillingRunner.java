package com.runner;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import com.pom.Pom_Class;

public class BillingRunner extends Base_class {

	public static WebDriver driver = getbrowser("chrome");

	public static Pom_Class pom = new Pom_Class(driver);

	public static void main(String[] args) throws InterruptedException {

		geturl("https://ehr.vozo.xyz:444/");

		// Enter Username
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

		sendkeys(pom.getinstance().getUsername(), "tech1");

		// Enter Password
		sendkeys(pom.getinstance().getPassword(), "capminds@03");

		// Click Signin Button '
		Clickonelement(pom.getinstance().getSigninbtn());

		// Click On Month Option
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

		// click Billing Module
		Clickonelement(pom.getBilling().getClickBillingModule());

	////////// Insurance claim //////////////////

		// Enter client name
		sendkeys(pom.getBilling().getEnterclientname(), "dineshvarma");

		// Enter Payer name
		sendkeys(pom.getBilling().getEnterPayername(), "United National");

		// select UNITED HEALTHCARE
		Clickonelement(pom.getBilling().getSelectUNITEDHEALTHCARE());

		// select UNITED HEALTHCARE1
		Clickonelement(pom.getBilling().getSelectUNITEDHEALTHCARE1());

		// click Office drop down
		Clickonelement(pom.getBilling().getClickOfficeDropdown());

		// select Test facility phar
		Clickonelement(pom.getBilling().getSelectTestFacilityPhar());

		// click Billing status
		Clickonelement(pom.getBilling().getClickByBillingStatus());

		// select Paid In full
		Clickonelement(pom.getBilling().getSelectPaidInFull());

		// click By claim status
		Clickonelement(pom.getBilling().getClickByClaimStatus());

		// select claimed option
		Clickonelement(pom.getBilling().getselectClaimed());

		// click date
		Clickonelement(pom.getBilling().getclickdate());

		// select Start date
		Clickonelement(pom.getBilling().getselectStartDate());

		// select End date
		Clickonelement(pom.getBilling().getselectEndDate());

		// Click the Search button
		Clickonelement(pom.getBilling().getClickSearchButton());

		// Click Generate form button
		Clickonelement(pom.getBilling().getClickGenerateFormButton());

		// Click HCFA(PDF)
		Clickonelement(pom.getBilling().getClickHCPAPDF());

		// Click Validate Only
		// Clickonelement(pom.getBilling().getClickValidateOnly());

		// Click Close button
		// Clickonelement(pom.getBilling().getClickClose());

////////////////Patient Payment /////////////////

		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

// patient payment
		Thread.sleep(4000);

		Clickonelement(pom.getBilling().getpatientpayment());

// patient search

		sendkeys(pom.getBilling().getpateintsear1(), "guna");

// click patientpayment1

		Clickonelement(pom.getBilling().getpateintpayment1());

// search pat

		sendkeys(pom.getBilling().getpateintsear2(), "guna");

// click patientpayment1 TODO

//Clickonelement(pom.getBilling().getclipateintsear2());
		
///////// patient statement//////////////////

		Clickonelement(pom.getBilling().getpatientstate());

// patient state se

		sendkeys(pom.getBilling().getpateintsear3(), "John");

// click patientpayment1 TODO

// Clickonelement(pom.getBilling().getclipateintsear3());

// click radi

		Clickonelement(pom.getBilling().getcliradio());

// stat bal

		sendkeys(pom.getBilling().getstbal(), "10");

// end bal

		sendkeys(pom.getBilling().getenbal(), "50000");

// clic sear

		Clickonelement(pom.getBilling().getclisear1());

// cli all pat

		Thread.sleep(3000);

		Clickonelement(pom.getBilling().getallpatcl());

// patient state se

		sendkeys(pom.getBilling().getsearchpat4(), "John");

// click patientpayment1 TODO

// Clickonelement(pom.getBilling().getselepat2());

// click radi

		Clickonelement(pom.getBilling().getclirad2());

// stat bal

		sendkeys(pom.getBilling().getstabal2(), "10");

// end bal

		sendkeys(pom.getBilling().getenbal2(), "50000");

// click sera

		Clickonelement(pom.getBilling().getclisear5());

//////////////////////   Patient balance /ledger        //////////////	

		Thread.sleep(3000);
		// click Patient balance Ledger
		Clickonelement(pom.getBilling().getClickPatientBalanceLedger());

		// Enter client name
		sendkeys(pom.getBilling().getEnterClientName(), "John");

		// click select john peter
		Clickonelement(pom.getBilling().getSelectJonPeter());

		// click top on Patient balance Ledger details
		Clickonelement(pom.getBilling().getclickledger());

		// click Billing Module
		Clickonelement(pom.getBilling().getClickBillingModule());

		// click date
		Clickonelement(pom.getBilling().getclickdate());

		// select Start date
		Clickonelement(pom.getBilling().getselectStartDate());

		// select End date
		Clickonelement(pom.getBilling().getselectEndDate());

		// Click the Search button
		Clickonelement(pom.getBilling().getClickSearchButton());

		// click On Insurance claim
		Clickonelement(pom.getBilling().getclickInsuranceClaim());

		// click Patient balance Ledger
		Clickonelement(pom.getBilling().getClickPatientBalanceLedger());

		/////////////////// FEES SCHEDULE ////////////////////////////

		Clickonelement(pom.getBilling().getfees());

// cpt sear
		Thread.sleep(2000);

		sendkeys(pom.getBilling().getcpthcpcssear(), "940612");

// clic cpt TODO

// Clickonelement(pom.getBilling().getclicpt());

// insu name

		sendkeys(pom.getBilling().getinsuranam(), "UNITED HEALTHCARE");

// sele insu TODO

// Clickonelement(pom.getBilling().getinsuranamsele());

// pay name

		sendkeys(pom.getBilling().getpaynam(), "welcome");

// sele payer TODO

// Clickonelement(pom.getBilling().getpaynamsele());

// pick name

		sendkeys(pom.getBilling().getpicklis(), "hello");

// sele pick TODO

		Thread.sleep(2000);

// Clickonelement(pom.getBilling().getpicklissele());

// updat cl

		Clickonelement(pom.getBilling().getupdacli());

// cl

		Clickonelement(pom.getBilling().getclied());

// cl

		Clickonelement(pom.getBilling().getcliedcancel());

// cli ad

		Clickonelement(pom.getBilling().getcliaddne());

// sele cpt

		Selectone(pom.getBilling().getselecpt(), "CPT4");

// sele cpt

		sendkeys(pom.getBilling().getsearco(), "a");

// cli cod

		Clickonelement(pom.getBilling().getselecptco());

// base pri

		sendkeys(pom.getBilling().getbasepri(), "5000");

// base pri

		sendkeys(pom.getBilling().getexpectrei(), "200");

// cpt pri

// sendkeys(pom.getBilling().getcptmod(), "cpt code");

// office sel

		Selectone(pom.getBilling().getseleoff(), "oemrvozo");

// sele ndc

		sendkeys(pom.getBilling().getNdcco(), "10");

// send ndc qu

		sendkeys(pom.getBilling().getNdcquan(), "10");

// send ndc un

		sendkeys(pom.getBilling().getNdcun(), "10");

// payer id

		Selectone(pom.getBilling().getpayerid(), "United National");

// pay name

		sendkeys(pom.getBilling().getpaynam2(), "arvind swamy");

// cus des

		sendkeys(pom.getBilling().getcusdes(), "new cpt code ");

// cus des

		sendkeys(pom.getBilling().getpickca(), "Yellow");

// clic save

		Clickonelement(pom.getBilling().getclisave());

// cli ad

		Thread.sleep(4000);

		Clickonelement(pom.getBilling().getcliaddne());

// sele hcpcs

		Selectone(pom.getBilling().getselecpt(), "HCPCS");

// search code

		sendkeys(pom.getBilling().getcodese2(), "a");

// sele cod

		Clickonelement(pom.getBilling().getselecodese2());

// base pri hcpcs

		sendkeys(pom.getBilling().getbasepri(), "5000");

// base pri hcpcs

		sendkeys(pom.getBilling().getexpectrei(), "200");

// hcpcs mod

//sendkeys(pom.getBilling().getcptmod(), "HCPCS CODE");

// office sel

		Selectone(pom.getBilling().getseleoff(), "oemrvozo");

// sele ndc

		sendkeys(pom.getBilling().getNdcco(), "10");

// send ndc qu

		sendkeys(pom.getBilling().getNdcquan(), "10");

// send ndc un

		sendkeys(pom.getBilling().getNdcun(), "10");

// payer id

		Selectone(pom.getBilling().getpayerid(), "United National");

// pay name

		sendkeys(pom.getBilling().getpaynam2(), "Shanker");

// cus des

		sendkeys(pom.getBilling().getcusdes(), "new hcpcs code ");

// pickca des

		sendkeys(pom.getBilling().getpickca(), "Yellow");

// clic save hcpcs

		Clickonelement(pom.getBilling().getclisave());

// cli ad

		Thread.sleep(4000);

		Clickonelement(pom.getBilling().getcliaddne());

// sele hcpcs

		Selectone(pom.getBilling().getselecpt(), "CUSTOMS");

// search code

		sendkeys(pom.getBilling().getcodese2(), "1");

//sele cus cod

		Clickonelement(pom.getBilling().getselecusco());

// base pri hcpcs

		sendkeys(pom.getBilling().getbasepri(), "2000");

// base pri hcpcs

		sendkeys(pom.getBilling().getexpectrei(), "100");

// office sel

		Selectone(pom.getBilling().getseleoff(), "oemrvozo");

// cus des

		sendkeys(pom.getBilling().getcusdes(), "new customs code ");

// pickca des

		sendkeys(pom.getBilling().getpickca(), "Blue");

// clic save cusom

		Clickonelement(pom.getBilling().getclisave());
		//// ICD9
		Thread.sleep(6000);

		// Click Fees Schedule
	//	Clickonelement(pom.getBilling().getclickFeesSchedule());

		Thread.sleep(2000);

		// Click ICD 9
		Clickonelement(pom.getBilling().getclickICD9());

		// enter ICD code
		sendkeys(pom.getBilling().getEnterICDCode(), "015.80");

		Thread.sleep(4000);

		// Select ICD code
		Clickonelement(pom.getBilling().getSelectICDCode());

		// enter Pick list
		sendkeys(pom.getBilling().getEnterPickList(), "Yellow");

		// Select Orange pick list
		Clickonelement(pom.getBilling().getSelectYellow());

		// Click Update
		Clickonelement(pom.getBilling().getClickUpdate());

		// Click Edit option
		Clickonelement(pom.getBilling().getClickEDit());

//		//select ICD 9
//	    Selectone(pom.getBilling().getselectCodeType1(),"ICD-9" );
//	   
//	    //Clear Codes
//	    ClearText(pom.getBilling().getclearcode()); 
//    
//	  //enter Pick list
//	  	sendkeys(pom.getBilling().getEntercode(), "670.0");
//		

		Thread.sleep(4000);

		// Click Edit option
		Clickonelement(pom.getBilling().getClickCancel());

		Thread.sleep(2000);

		// Click Add New Option
		Clickonelement(pom.getBilling().getClickAddNew());

		// Click in code type
		Clickonelement(pom.getBilling().getClickCodeType());

		Thread.sleep(2000);

		// select Code Type
		Clickonelement(pom.getBilling().getSelectCodeType());

		// enter Pick list
		sendkeys(pom.getBilling().getEnterCode(), "6");

		// select Enter Code
		Clickonelement(pom.getBilling().getSelectEnterCode());

		// click in office
		Clickonelement(pom.getBilling().getClickOffice());

		// Select Test Facility Phar
		Clickonelement(pom.getBilling().getSelectTestFacilityPhar1());

		// enter Custom description
		sendkeys(pom.getBilling().getEnterDescription(), "Fever");

		// enter Pick list category
		sendkeys(pom.getBilling().getEnterPicklistCategory(), "Normal check up");

		// Select Cancel
//		Clickonelement(pom.getBilling().getClickCancel1());

		// Select Save
		Clickonelement(pom.getBilling().getClicksave());

	///////////////// ICD 10 ///////////////////

		Thread.sleep(6000);

		// Click ICD 10
		Clickonelement(pom.getBilling().getClickICD10());

		// enter TCD 10 CODE
		sendkeys(pom.getBilling().getEnterICD10(), "L59.0");

		// Select ICD code
		Clickonelement(pom.getBilling().getSelectICD10());

		// Enter PickList
		sendkeys(pom.getBilling().getEnterPickList1(), "red");

		// Select ICD code
		Clickonelement(pom.getBilling().getSelectwhite());

		Thread.sleep(2000);
		// Select Update Button
		Clickonelement(pom.getBilling().getSelectUpdate());

		// Click Edit
		Clickonelement(pom.getBilling().getClickEdit());

		// Click Cancel
		Clickonelement(pom.getBilling().getClickCancel2());
		Thread.sleep(3000);

		// Click Add new Button
		Clickonelement(pom.getBilling().getClickaddNew());

		// Click Cod type
		Clickonelement(pom.getBilling().getClickcodeType());

		// Click select code type
		Clickonelement(pom.getBilling().getSelectcodeType());

		Thread.sleep(2000);

		// Enter Code
		sendkeys(pom.getBilling().getClickCode(), "3");

		Thread.sleep(2000);
		// select code type
		Clickonelement(pom.getBilling().getSelectCode());

		// Click Office
		Clickonelement(pom.getBilling().getClickoffice());

		// select code type
		Clickonelement(pom.getBilling().getselectTestfacilityphar());

		// Enter Code description
		sendkeys(pom.getBilling().getEnterCodeDescription(), "Normal");

		// Enter Code description
		sendkeys(pom.getBilling().getEnterPicklistcategory(), "Normality ");

		// select code type
		Clickonelement(pom.getBilling().getClickSave());

		// select code type
		// Clickonelement(pom.getBilling().getClickCance());

		Thread.sleep(6000);

	///////////////// EOB Add Payment ///////////////////
		

		Clickonelement(pom.getBilling().getclieob());

		// sel insu

		Selectone(pom.getBilling().getselein(), "United National");

		// star date

		sendkeys(pom.getBilling().getstardat(), "2022-05-01");

		// end date

		sendkeys(pom.getBilling().getendat(), "2022-05-07");

		// sear eo

		Clickonelement(pom.getBilling().getseareo());

		// sele eob

		Clickonelement(pom.getBilling().getseleeob());

		// sele edit eob

		Clickonelement(pom.getBilling().getseleed());

		// sele edit eob

		Thread.sleep(2000);

		Clickonelement(pom.getBilling().getclican());

		// Click EOB
		//Clickonelement(pom.getBilling().getClickEOB());

		// Click Add Payment
		Clickonelement(pom.getBilling().getClickAddPyment());

		// Click date
		Clickonelement(pom.getBilling().getClickDate());

		// Click Select Date
		Clickonelement(pom.getBilling().getSelectDate());

		// Click Payer
		Clickonelement(pom.getBilling().getClickPayer());

		// Click United Health care
		Clickonelement(pom.getBilling().getSelectUnitedHealth());

		// Click SelectPaymentMethod
		Clickonelement(pom.getBilling().getSelectPaymentMethod());

		// Click Authorize.net
		Clickonelement(pom.getBilling().getSelectAutorize());

		// Enter Payment Number
		sendkeys(pom.getBilling().getEnterPaymentNumber(), "45767888 ");

		// Enter Amount
		sendkeys(pom.getBilling().getEnterAmount(), "1000");

		// Click Save button
		Clickonelement(pom.getBilling().getSelectSave());

		// Click Cancel button
		Clickonelement(pom.getBilling().getSelectCancel());
	}
}
