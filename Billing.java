package com.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Billing {
	
	public WebDriver driver;
	
	public Billing(WebDriver driver2) {
		this.driver = driver2;

		PageFactory.initElements(driver2, this);

	}

	public WebDriver getDriver() {
		return driver;
	}
	
	//////////      Insurance claim        //////////////////

	@FindBy(xpath = "//a[normalize-space()='Billing']")
    private WebElement ClickBillingModule;

    public WebElement getClickBillingModule() {
	return ClickBillingModule;
   }
    
    @FindBy(xpath = "//div[contains(@class,'ins-top-btn ins-p-s vo_1_1')]//input[@id='search-btn-hover']")
    private WebElement Enterclientname;

    public WebElement getEnterclientname() {
	return Enterclientname;
   }
    @FindBy(xpath = "(//input[@id='search-btn-hover'])[2]")
    private WebElement EnterPayername;

    public WebElement getEnterPayername() {
	return EnterPayername;
   }
    @FindBy(xpath = "//div[@class='ins-top-btn ins-p-s ins-bill-src vo_1_1 ']//input[@id='search-btn-hover']")
    private WebElement SelectUNITEDHEALTHCARE;

    public WebElement getSelectUNITEDHEALTHCARE() {
	return SelectUNITEDHEALTHCARE;
   }
    @FindBy(xpath = "//div[contains(text(),'United National')]")
    private WebElement SelectUNITEDHEALTHCARE1;

    public WebElement getSelectUNITEDHEALTHCARE1() {
	return SelectUNITEDHEALTHCARE1;
   }
  
    @FindBy(xpath = "//div[contains(@class,'insurance_claim_form_1')]//select[@id='select-btn-hover']")
    private WebElement ClickOfficeDropdown;

    public WebElement getClickOfficeDropdown() {
	return ClickOfficeDropdown;
   }
    @FindBy(xpath = "//option[contains(text(),'oemrvozo')]")
    private WebElement SelectTestFacilityPhar;

    public WebElement getSelectTestFacilityPhar() {
	return SelectTestFacilityPhar;
   }
    @FindBy(xpath = "(//select[@id='select-btn-hover'])[2]")
    private WebElement ClickByBillingStatus;

    public WebElement getClickByBillingStatus() {
	return ClickByBillingStatus;
    }
    @FindBy(xpath = "//option[@value='Paid In Full']")
    private WebElement SelectPaidInFull;

    public WebElement getSelectPaidInFull() {
	return SelectPaidInFull;
   }
    @FindBy(xpath = "(//select[@id='select-btn-hover'])[3]")
    private WebElement ClickByClaimStatus;

    public WebElement getClickByClaimStatus() {
	return ClickByClaimStatus;
   }
    @FindBy(xpath = "//option[normalize-space()='Claimed']")
    private WebElement selectClaimed;

    public WebElement getselectClaimed() {
	return selectClaimed;
   }
    @FindBy(xpath = "//input[contains(@placeholder,'Start date')]")
    private WebElement clickdate;

    public WebElement getclickdate() {
	return clickdate;
   }
    @FindBy(xpath = "//td[@class='ant-picker-cell ant-picker-cell-in-view ant-picker-cell-today']//div[@class='ant-picker-cell-inner'][normalize-space()='30']")
    private WebElement selectStartDate;

    public WebElement getselectStartDate() {
	return selectStartDate;
   }
    @FindBy(xpath = "//td[contains(@title,'2022-06-14')]")
    private WebElement selectEndDate;

    public WebElement getselectEndDate() {
	return selectEndDate;
   }
    @FindBy(xpath = "//button[normalize-space()='Search']")
    private WebElement ClickSearchButton;

    public WebElement getClickSearchButton() {
	return ClickSearchButton;
   }
    @FindBy(xpath = "//tbody/tr[1]/td[8]/div[1]/button[1]/button[1]")
    private WebElement ClickGenerateFormButton;

    public WebElement getClickGenerateFormButton() {
	return ClickGenerateFormButton;
   }
    @FindBy(xpath = "//tbody/tr[1]/td[8]/div[1]/button[1]/button[1]")
    private WebElement ClickHCPAPDF;

    public WebElement getClickHCPAPDF() {
	return ClickHCPAPDF;
   }
    @FindBy(xpath = "//button[normalize-space()='Validate Only']")
    private WebElement ClickValidateOnly;

    public WebElement getClickValidateOnly() {
	return ClickValidateOnly;
   }
    
    @FindBy(xpath = "//button[normalize-space()='Close']")
    private WebElement ClickClose;

    public WebElement getClickClose() {
	return ClickClose;
   }
    @FindBy(xpath = "(//a[normalize-space()='Patient payment'])[1]")

	private WebElement patientpayment;

	public WebElement getpatientpayment() {
		return patientpayment;
	}

	@FindBy(xpath = "(//input[@class='ant-input'])[1]")

	private WebElement pateintsear1;

	public WebElement getpateintsear1() {
		return pateintsear1;
	}

	@FindBy(xpath = "(//div[@id='rc-tabs-0-tab-2'])[1]")

	private WebElement pateintpayment1;

	public WebElement getpateintpayment1() {

		return pateintpayment1;
	}

	@FindBy(xpath = "(//input[@id='search-btn-hover'])[1]")

	private WebElement pateintsear2;

	public WebElement getpateintsear2() {
		return pateintsear2;
	}

	@FindBy(xpath = "(//div[@class='content'])[1]")

	private WebElement clipateintsear2;

	public WebElement getclipateintsear2() {
		return clipateintsear2;
	}

       ///////// patient statemen//////////////////
	
	@FindBy(xpath = "(//a[normalize-space()='Patient statement'])[1]")

	private WebElement patientstate;

	public WebElement getpatientstate() {
		return patientstate;
	}
	
	@FindBy(xpath = "(//input[@placeholder='Search Patient'])[1]")

	private WebElement pateintsear3;

	public WebElement getpateintsear3() {
		return pateintsear3;
	}
	
	@FindBy(xpath = "(//div[contains(text(),'John peter')])[1]")

	private WebElement clipateintsear3;

	public WebElement getclipateintsear3() {
		return clipateintsear3;
	}
	
	@FindBy(xpath = "(//input[@id='zerocheck'])[1]")

	private WebElement cliradio;

	public WebElement getcliradio() {
		return cliradio;
	}
	
	@FindBy(xpath = "(//input[@id='patstafrom'])[1]")

	private WebElement stbal;

	public WebElement getstbal() {
		
		return stbal;
	}

	@FindBy(xpath = "(//input[@id='patstato'])[1]")

	private WebElement enbal;

	public WebElement getenbal() {
		
		return enbal;
	}
	
	@FindBy(xpath = "(//button[normalize-space()='Search'])[1]")

	private WebElement clisear1;

	public WebElement getclisear1() {
		
		return clisear1;
	}
	
	@FindBy(xpath = "//div[contains(text(),'All Patients')]")

	private WebElement allpatcl;

	public WebElement getallpatcl() {
		
		return allpatcl;
	}
	
	@FindBy(xpath = "(//input[@placeholder='Search Patient'])[2]")

	private WebElement searchpat4;

	public WebElement getsearchpat4() {
		
		return searchpat4;
	}
	

	@FindBy(xpath = "(//div[contains(text(),'John peter')])[1]")

	private WebElement selepat2;

	public WebElement getselepat2() {
		
		return selepat2;
	}
	
	@FindBy(xpath = "(//input[@id='zerocheck_1'])[1]")

	private WebElement clirad2;

	public WebElement getclirad2() {
		
		return clirad2;
	}
	
	@FindBy(xpath = "(//input[@id='patstafrom_1'])[1]")

	private WebElement stabal2;

	public WebElement getstabal2() {
		
		return stabal2;
	}
	
	@FindBy(xpath = "(//input[@id='patstato_1'])[1]")

	private WebElement enbal2;

	public WebElement getenbal2() {
		
		return enbal2;
	}
	
	@FindBy(xpath = "(//button[@class='btn btn-primary'])[1]")

	private WebElement clisear5;

	public WebElement getclisear5() {
		
		return clisear5;
	}
	
    //////////////////////   Patient balance /ledger        //////////////	
    
    @FindBy(xpath = "//a[contains(text(),'Insurance Claim')]")
    private WebElement clickInsuranceClaim;

    public WebElement getclickInsuranceClaim() {
	return clickInsuranceClaim;
   }
    @FindBy(xpath = "//a[contains(text(),'Patient balance /ledger')]")
    private WebElement ClickPatientBalanceLedger;

    public WebElement getClickPatientBalanceLedger() {
	return ClickPatientBalanceLedger;
   }
    @FindBy(xpath = "//input[@placeholder='Search Patient']")
    private WebElement EnterClientName;

    public WebElement getEnterClientName() {
	return EnterClientName;
   }
    
    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]")
    private WebElement SelectJonPeter;

    public WebElement getSelectJonPeter() {
	return SelectJonPeter;
   }
    @FindBy(xpath = "//tbody/tr[@class='MuiTableRow-root table-data-row schedule-body-row']/td[2]")
    private WebElement clickledger;

    public WebElement getclickledger() {
	return clickledger;
   }   
	
	/////////////////////  FEES SCHEDULE   ////////////////////////////

	
@FindBy(xpath = "(//a[normalize-space()='Fee schedule'])[1]")

private WebElement fees;

public WebElement getfees() {

return fees;
}

@FindBy(xpath = "(//input[@placeholder='CPT/HCPCS/Custom Procedure'])[1]")

private WebElement cpthcpcssear;

public WebElement getcpthcpcssear() {

return cpthcpcssear;
}

@FindBy(xpath = "(//div[contains(@class,'title')][normalize-space()='940612:Test code'])[1]")

private WebElement clicpt;

public WebElement getclicpt() {

return clicpt;
}

@FindBy(xpath = "(//input[contains(@placeholder,'Insurance Payer Name')])[1]")

private WebElement insuranam;

public WebElement getinsuranam() {

return insuranam;
}

@FindBy(xpath = "(//div[@class='title'])[1]")

private WebElement insuranamsele;

public WebElement getinsuranamsele() {

return insuranamsele;
}

@FindBy(xpath = "(//input[@placeholder='Plan Name'])[1]")

private WebElement paynam;

public WebElement getpaynam() {

return paynam;
}

@FindBy(xpath = "(//div[contains(@class,'title')][normalize-space()='new arvind'])[1]")

private WebElement paynamsele;

public WebElement getpaynamsele() {

return paynamsele;
}

@FindBy(xpath = "(//input[@placeholder='Picklist Category'])[1]")

private WebElement picklis;

public WebElement getpicklis() {

return picklis;
}

@FindBy(xpath = "//div[contains(text(),'hello')]")

private WebElement picklissele;

public WebElement getpicklissele() {

return picklissele;
}

@FindBy(xpath = "(//button[normalize-space()='Update'])[1]")

private WebElement updacli;

public WebElement getupdacli() {

return updacli;
}

@FindBy(xpath = "(//*[name()='svg'][@stroke='currentColor'])[2]")

private WebElement clied;

public WebElement getclied() {

return clied;
}

@FindBy(xpath = "(//span[@aria-hidden='true'])[1]")

private WebElement cliedcancel;

public WebElement getcliedcancel() {

return cliedcancel;
}

@FindBy(xpath = "(//button[normalize-space()='Add New'])[1]")

private WebElement cliaddne;

public WebElement getcliaddne() {

return cliaddne;
}

@FindBy(xpath = "(//select[@id='code_typeval'])[1]")

private WebElement selecpt;

public WebElement getselecpt() {

return selecpt;
}

@FindBy(xpath = "(//input[@id='codescval'])[1]")

private WebElement searco;

public WebElement getsearco() {

return searco;
}
@FindBy(xpath = "(//div[contains(text(),'Vkard--fdfdsfds')])[1]")   //(//div[@class='title'][normalize-space()='940612 : Test code'])[1]

private WebElement selecptco;

public WebElement getselecptco() {

return selecptco;
}

@FindBy(xpath = "(//input[@id='basepval'])[1]")

private WebElement basepri;

public WebElement getbasepri() {

return basepri;
}

@FindBy(xpath = "(//input[@id='expremival'])[1]")

private WebElement expectrei;

public WebElement getexpectrei() {

return expectrei;
}

@FindBy(xpath = "(//input[@id='cpthpcmode1'])[1]")

private WebElement cptmod;

public WebElement getcptmod() {

return cptmod;
}

@FindBy(xpath = "(//select[@id='scoffice'])[1]")

private WebElement seleoff;

public WebElement getseleoff() {

return seleoff;
}

@FindBy(xpath = "(//input[@id='NDCCode'])[1]")

private WebElement Ndcco;

public WebElement getNdcco() {

return Ndcco;
}
@FindBy(xpath = "(//input[@id='NDCQuantity'])[1]")

private WebElement Ndcquan;

public WebElement getNdcquan() {

return Ndcquan;
}

@FindBy(xpath = "(//input[@id='NDCUnits'])[1]")

private WebElement Ndcun;

public WebElement getNdcun() {

return Ndcun;
}

@FindBy(xpath = "(//select[@id='payerid'])[1]")

private WebElement payerid;

public WebElement getpayerid() {

return payerid;
}

@FindBy(xpath = "(//input[@id='payname'])[1]")

private WebElement paynam2;

public WebElement getpaynam2() {

return paynam2;
}

@FindBy(xpath = "(//input[@id='customdesc'])[1]")

private WebElement cusdes;

public WebElement getcusdes() {

return cusdes;
}

@FindBy(xpath = "(//input[@id='pickcat'])[1]")

private WebElement pickca;

public WebElement getpickca() {

return pickca;
}

@FindBy(xpath = "(//button[normalize-space()='Save'])[1]")

private WebElement clisave;

public WebElement getclisave() {

return clisave;
}

@FindBy(xpath = "(//input[@id='codescval'])[1]")

private WebElement codese2;

public WebElement getcodese2() {

return codese2;
}

@FindBy(xpath = "(//div[contains(text(),'123--Viral Fever 2')])[1]")

private WebElement selecusco;

public WebElement getselecusco() {

return selecusco;
}

@FindBy(xpath = "(//div[contains(text(),'A7505--Hmes or trach valve housing')])[1]")

private WebElement selecodese2;

public WebElement getselecodese2() {

return selecodese2;
}
    ////ICD9
	
   
    @FindBy(xpath = "(//div[contains(text(),'ICD-9')])[1]")
    private WebElement clickICD9;

    public WebElement getclickICD9() {
	return clickICD9;	
   } 
    @FindBy(xpath = "//input[@placeholder='ICD 9']")
    private WebElement EnterICDCode;

    public WebElement getEnterICDCode() {
	return EnterICDCode;
   } 
    @FindBy(xpath = "//div[contains(text(),'015.80: Tuberculosis of other specified joint, uns')]")
    private WebElement SelectICDCode;

    public WebElement getSelectICDCode() {
	return SelectICDCode;
   } 
    @FindBy(xpath = "//div[@class='ins-top-btn ins-p-s m-l-15 i_p_e_1 for-icd-9-srch-box-res']//input[@placeholder='Picklist Category']")
    private WebElement EnterPickList;

    public WebElement getEnterPickList() {
	return EnterPickList;
   } 
    @FindBy(xpath = "//div[contains(text(),'Yellow')]")
    private WebElement SelectYellow;

    public WebElement getSelectYellow() {
	return SelectYellow;
   } 
    @FindBy(xpath = "//button[@class='m-l-15 create-appt edit-note h-34 input-size u_b_h for-icd-9-srch-box-res-but btn-fnt-wgt btn btn-primary']")
    private WebElement ClickUpdate;

    public WebElement getClickUpdate() {
	return ClickUpdate;
   }
    @FindBy(xpath = "//tbody/tr[1]/td[4]/button[1]//*[name()='svg']")
    private WebElement ClickEDit;

    public WebElement getClickEDit() {
	return ClickEDit;
   }
    @FindBy(xpath = "//option[normalize-space()='ICD-9']")
    private WebElement selectCodeType;

    public WebElement getselectCodeType1() {
	return selectCodeType;
   }
    @FindBy(xpath = "//input[@id='icd9codescval']")
    private WebElement clearcode;

    public WebElement getclearcode() {
	return clearcode;
   }
    @FindBy(xpath = "//input[@id='icd9codescval']")
    private WebElement Entercode;

    public WebElement getEntercode() {
	return Entercode;
   }
    @FindBy(xpath = "(//button[normalize-space()='Cancel'])[1]")
    private WebElement ClickCancel;

    public WebElement getClickCancel() {
	return ClickCancel;
   }
    @FindBy(xpath = "(//button[contains(@type,'button')][normalize-space()='Add New'])[2]")
    private WebElement ClickAddNew;

    public WebElement getClickAddNew() {
	return ClickAddNew;
   }
    @FindBy(xpath = "//select[@id='code_typeval']")
    private WebElement ClickCodeType;

    public WebElement getClickCodeType() {
	return ClickCodeType;
   }
    @FindBy(xpath = "(//option[normalize-space()='ICD-9'])[1]")
    private WebElement SelectCodeType;

    public WebElement getSelectCodeType() {
	return SelectCodeType;
   }
    @FindBy(xpath = "//input[@id='codescval']")
    private WebElement EnterCode;

    public WebElement getEnterCode() {
	return EnterCode;
   }
    @FindBy(xpath = "//div[contains(text(),'058.21-- Human herpesvirus 6 encephalitis')]")
    private WebElement SelectEnterCode;

    public WebElement getSelectEnterCode() {
	return SelectEnterCode;
   }
    @FindBy(xpath = "//select[@id='scoffice']")
    private WebElement ClickOffice;

    public WebElement getClickOffice() {
	return ClickOffice;
   }
    @FindBy(xpath = "//option[@value='3']")
    private WebElement SelectTestFacilityPhar1;

    public WebElement getSelectTestFacilityPhar1() {
	return SelectTestFacilityPhar;
   } 
    @FindBy(xpath = "//input[@id='customdesc']")
    private WebElement EnterDescription;

    public WebElement getEnterDescription() {
	return EnterDescription;
   }  
    @FindBy(xpath = "//input[@id='pickcat']")
    private WebElement EnterPicklistCategory;

    public WebElement getEnterPicklistCategory() {
	return EnterPicklistCategory;
   } 
    @FindBy(xpath = "//button[normalize-space()='Save']")
    private WebElement Clicksave ;

    public WebElement getClicksave() {
	return Clicksave;
   }
    @FindBy(xpath = "//button[normalize-space()='Cancel']")
    private WebElement ClickCancel1 ;

    public WebElement getClickCancel1() {
	return ClickCancel1;
   }
    
                      ///////ICD 10
    
    
    @FindBy(xpath = "(//div[contains(text(),'ICD-10')])[1]")
    private WebElement ClickICD10;

    public WebElement getClickICD10() {
	return ClickICD10;
   }
    @FindBy(xpath = "(//input[@placeholder='ICD 10'])[1]")
    private WebElement EnterICD10;

    public WebElement getEnterICD10() {
	return EnterICD10;
   } 
    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]")
    private WebElement SelectICD10;

    public WebElement getSelectICD10() {
	return SelectICD10;
   } 
    @FindBy(xpath = "//div[@class='ins-top-btn ins-p-s m-l-15 f_s_i_d for-icd-9-srch-box-res']//input[@placeholder='Picklist Category']")
    private WebElement EnterPickList1;

    public WebElement getEnterPickList1() {
	return EnterPickList1;
   } 
    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]")
    private WebElement Selectwhite;

    public WebElement getSelectwhite() {
	return Selectwhite;
   } 
    @FindBy(xpath = "//body/div[@id='root']/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/button[1]")
    private WebElement SelectUpdate;

    public WebElement getSelectUpdate() {
	return SelectUpdate;
   }  
    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[2]/div[1]/div[3]/div[1]/div[2]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[4]/button[1]")
    private WebElement ClickEdit;

    public WebElement getClickEdit() {
	return ClickEdit;
   } 
    @FindBy(xpath = "//button[normalize-space()='Cancel']")
    private WebElement ClickCancel2;

    public WebElement getClickCancel2() {
	return ClickCancel2;
   } 
    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[2]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/button[1]")
    private WebElement ClickaddNew;

    public WebElement getClickaddNew() {
	return ClickaddNew;
   } 
    @FindBy(xpath = "//select[@id='code_typeval']")
    private WebElement ClickcodeType;

    public WebElement getClickcodeType() {
	return ClickcodeType;
   }  
    @FindBy(xpath = "//option[@value='102']")
    private WebElement SelectycodeType;

    public WebElement getSelectcodeType() {
	return SelectycodeType;
   }  
    @FindBy(xpath = "/html[1]/body[1]/div[4]/div[1]/div[1]/div[1]/form[1]/div[2]/div[2]/div[1]/div[1]/div[1]/input[1]")
    private WebElement ClickCode;

    public WebElement getClickCode() {
	return ClickCode;
   } 
    @FindBy(xpath = "//div[contains(text(),'E71.111--3-methylglutaconic aciduria')]")
    private WebElement SelectCode;

    public WebElement getSelectCode() {
	return SelectCode;
   }  
    @FindBy(xpath = "//select[@id='scoffice']")
    private WebElement Clickoffice;

    public WebElement getClickoffice() {
	return Clickoffice;
   } 
    @FindBy(xpath = "//option[@value='3']")
    private WebElement selectTestfacilityphar;

    public WebElement getselectTestfacilityphar() {
	return selectTestfacilityphar;
   } 
    @FindBy(xpath = "//input[@id='customdesc']")
    private WebElement EnterCodeDescription;

    public WebElement getEnterCodeDescription() {
	return EnterCodeDescription;
   }
    @FindBy(xpath = "//input[@id='pickcat']")
    private WebElement EnterPicklistcategory;

    public WebElement getEnterPicklistcategory() {
	return EnterPicklistcategory;
   }
    @FindBy(xpath = "//button[normalize-space()='Save']")
    private WebElement ClickSave;

    public WebElement getClickSave() {
	return ClickSave;
   } 
    @FindBy(xpath = "//button[normalize-space()='Cancel']")
    private WebElement ClickCance;

    public WebElement getClickCance() {
	return ClickCance;
   } 
    
    
    ///////////////////////   EOB  Add Payment        ///////////////////

	
@FindBy(xpath = "(//a[normalize-space()='EOB'])[1]")

private WebElement clieob;

public WebElement getclieob() {

return clieob;
}

@FindBy(xpath = "(//select[@id='EOBInsuranceNameSearch'])[1]")

private WebElement selein;

public WebElement getselein() {

return selein;
}

@FindBy(xpath = "(//input[@placeholder='Start date'])[1]")

private WebElement stardat;

public WebElement getstardat() {

return stardat;
}

@FindBy(xpath = "(//input[@placeholder='End date'])[1]")

private WebElement endat;

public WebElement getendat() {

return endat;
}

@FindBy(xpath = "(//button[normalize-space()='Search'])[1]")

private WebElement seareo;

public WebElement getseareo() {

return seareo;
}

@FindBy(xpath = "(//td[normalize-space()='United National'])[1]")

private WebElement seleeob;

public WebElement getseleeob() {

return seleeob;
}

@FindBy(xpath = "(//button[normalize-space()='Edit Payment'])[1]")

private WebElement seleed;

public WebElement getseleed() {

return seleed;
}

@FindBy(xpath = "(//button[normalize-space()='Cancel'])[1]")

private WebElement clican;

public WebElement getclican() {

return clican;
}
    @FindBy(xpath = "//a[normalize-space()='EOB']")
    private WebElement ClickEOB;

    public WebElement getClickEOB() {
	return ClickEOB;
   } 
    @FindBy(xpath = "//button[normalize-space()='Add Payment']")
    private WebElement ClickAddPyment;

    public WebElement getClickAddPyment() {
	return ClickAddPyment;
   }
    @FindBy(xpath = "//input[@id='mydate']")
    private WebElement ClickDate;

    public WebElement getClickDate() {
	return ClickDate;
   }
    @FindBy(xpath = "//div[contains(text(),'30')]")
    private WebElement SelectDate;

    public WebElement getSelectDate() {
	return SelectDate;
   }
    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[2]/select[1]")
    private WebElement ClickPayer;

    public WebElement getClickPayer() {
	return ClickPayer;
   }
    @FindBy(xpath = "//option[@value='2']")
    private WebElement SelectUnitedHealh;

    public WebElement getSelectUnitedHealth() {
	return SelectUnitedHealh;
   }
    @FindBy(xpath = "//select[@id='pay_method']")
    private WebElement SelectPaymentMethod;

    public WebElement getSelectPaymentMethod() {
	return SelectPaymentMethod;
   } 
    @FindBy(xpath = "//option[@value='Authorize.net']")
    private WebElement SelectAutorize;

    public WebElement getSelectAutorize() {
	return SelectAutorize;
   }
    @FindBy(xpath = "//div[1]//div[4]//div[1]//div[2]//input[1]")
    private WebElement EnterPaymentNumber;

    public WebElement getEnterPaymentNumber() {
	return EnterPaymentNumber;
   }
    @FindBy(xpath = "(//input[contains(@type,'text')])[3]")
    private WebElement EnterAmount;

    public WebElement getEnterAmount() {
	return EnterAmount;
   }
    @FindBy(xpath = "//button[normalize-space()='Save']")
    private WebElement SelectSave;

    public WebElement getSelectSave() {
	return SelectSave;
   }
    @FindBy(xpath = "//button[normalize-space()='Cancel']")
    private WebElement SelectCancel;

    public WebElement getSelectCancel() {
	return SelectCancel;
   } 
    
    
}
