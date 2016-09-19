package com.insights.models;

import org.hibernate.annotations.JoinColumnOrFormula;
import org.springframework.data.annotation.Id;
import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(schema = "dlca_kpi2016", name = "pb_v_api_dlr_radl")

public class DealerRADL implements Serializable {

    public DealerRADL() {}

    public DealerRADL(String CountryCd, String SAPId, String FiscalYr, float TotalAreaQty,
                      float MonsantoAreaQty, float OpportunityAreaQty, String AreaUOM,
                      float MonsantoLandSharePct, float SlsFcstTotalBudget, float CornFSAAreaCY, float CornFSAAreaCYM1, float CornFSAAreaCYM2, float CornFSAAreaCYM3,
                      float CornMonsantoAreaCY, float CornMonsantoAreaCYM1, float CornMonsantoAreaCYM2, float CornMonsantoAreaCYM3,
                      float CornNetSlsQtyCY, float CornNetSlsQtyCYM1, float CornNetSlsQtyCYM2, float CornNetSlsQtyCYM3,
                      float CornTotalSlsQtyCY, float CornTotalSlsQtyCYM1, float CornTotalSlsQtyCYM2, float CornTotalSlsQtyCYM3,
                      float SoyFSAAreaCY, float SoyFSAAreaCYM1, float SoyFSAAreaCYM2, float SoyFSAAreaCYM3,
                      float SoyMonsantoAreaCY, float SoyMonsantoAreaCYM1, float SoyMonsantoAreaCYM2, float SoyMonsantoAreaCYM3,
                      float SoyNetSlsQtyCY, float SoyNetSlsQtyCYM1, float SoyNetSlsQtyCYM2, float SoyNetSlsQtyCYM3,
                      float SoyTotalSlsQtyCY, float SoyTotalSlsQtyCYM1, float SoyTotalSlsQtyCYM2, float SoyTotalSlsQtyCYM3) {
        this.CountryCd = CountryCd;
        this.SAPId = SAPId;
        this.FiscalYr = FiscalYr;
        this.TotalAreaQty = TotalAreaQty;
        this.MonsantoAreaQty = MonsantoAreaQty;
        this.OpportunityAreaQty = OpportunityAreaQty;
        this.AreaUOM = AreaUOM;
        this.MonsantoLandSharePct = MonsantoLandSharePct;
        this.SlsFcstTotalBudget = SlsFcstTotalBudget;
        this.CornFSAAreaCY = CornFSAAreaCY;
        this.CornFSAAreaCYM1 = CornFSAAreaCYM1;
        this.CornFSAAreaCYM2 = CornFSAAreaCYM2;
        this.CornFSAAreaCYM3 = CornFSAAreaCYM3;
        this.CornMonsantoAreaCY = CornMonsantoAreaCY;
        this.CornMonsantoAreaCYM1 = CornMonsantoAreaCYM1;
        this.CornMonsantoAreaCYM2 = CornMonsantoAreaCYM2;
        this.CornMonsantoAreaCYM3 = CornMonsantoAreaCYM3;
        this.CornNetSlsQtyCY = CornNetSlsQtyCY;
        this.CornNetSlsQtyCYM1 = CornNetSlsQtyCYM1;
        this.CornNetSlsQtyCYM2 = CornNetSlsQtyCYM2;
        this.CornNetSlsQtyCYM3 = CornNetSlsQtyCYM3;
        this.CornTotalSlsQtyCY = CornTotalSlsQtyCY;
        this.CornTotalSlsQtyCYM1 = CornTotalSlsQtyCYM1;
        this.CornTotalSlsQtyCYM2 = CornTotalSlsQtyCYM2;
        this.CornTotalSlsQtyCYM3 = CornTotalSlsQtyCYM3;
        this.SoyFSAAreaCY = SoyFSAAreaCY;
        this.SoyFSAAreaCYM1 = SoyFSAAreaCYM1;
        this.SoyFSAAreaCYM2 = SoyFSAAreaCYM2;
        this.SoyFSAAreaCYM3 = SoyFSAAreaCYM3;
        this.SoyMonsantoAreaCY = SoyMonsantoAreaCY;
        this.SoyMonsantoAreaCYM1 = SoyMonsantoAreaCYM1;
        this.SoyMonsantoAreaCYM2 = SoyMonsantoAreaCYM2;
        this.SoyMonsantoAreaCYM3 = SoyMonsantoAreaCYM3;
        this.SoyNetSlsQtyCY = SoyNetSlsQtyCY;
        this.SoyNetSlsQtyCYM1 = SoyNetSlsQtyCYM1;
        this.SoyNetSlsQtyCYM2 = SoyNetSlsQtyCYM2;
        this.SoyNetSlsQtyCYM3 = SoyNetSlsQtyCYM3;
        this.SoyTotalSlsQtyCY = SoyTotalSlsQtyCY;
        this.SoyTotalSlsQtyCYM1 = SoyTotalSlsQtyCYM1;
        this.SoyTotalSlsQtyCYM2 = SoyTotalSlsQtyCYM2;
        this.SoyTotalSlsQtyCYM3 = SoyTotalSlsQtyCYM3;
    }

    @Id
    @Column(name = "cntry_cd")
    private String CountryCd;

    @Id
    @Column(name = "dlr_sap_id")
    private String SAPId;

    @Id
    @Column(name = "fiscl_yr")
    private String FiscalYr;

    // Area Information

    @Id
    @Column(name = "dlr_tot_area_qty")
    private float TotalAreaQty;

    @Id
    @Column(name = "dlr_mon_area_qty")
    private float MonsantoAreaQty;

    @Id
    @Column(name = "DLR_OPRTNTY_AREA_QTY")
    private float OpportunityAreaQty;

    @Id
    @Column(name = "AREA_UOM")
    private String AreaUOM;

    @Id
    @Column(name = "mon_land_shr_pct")
    private float MonsantoLandSharePct;

    @Id
    @Column(name = "SLS_FRCST_TOT_BDGT")
    private float SlsFcstTotalBudget;

    // Corn Columns

    @Id
    @Column(name = "corn_fsa_area_cy")
    private float CornFSAAreaCY;

    @Id
    @Column(name = "corn_fsa_area_cym1")
    private float CornFSAAreaCYM1;

    @Id
    @Column(name = "corn_fsa_area_cym2")
    private float CornFSAAreaCYM2;

    @Id
    @Column(name = "corn_fsa_area_cym3")
    private float CornFSAAreaCYM3;

    @Id
    @Column(name = "corn_mon_area_cy")
    private float CornMonsantoAreaCY;

    @Id
    @Column(name = "corn_mon_area_cym1")
    private float CornMonsantoAreaCYM1;

    @Id
    @Column(name = "corn_mon_area_cym2")
    private float CornMonsantoAreaCYM2;

    @Id
    @Column(name = "corn_mon_area_cym3")
    private float CornMonsantoAreaCYM3;

    @Id
    @Column(name = "corn_net_sls_cy_qty")
    private float CornNetSlsQtyCY;

    @Id
    @Column(name = "corn_net_sls_cym1_qty")
    private float CornNetSlsQtyCYM1;

    @Id
    @Column(name = "corn_net_sls_cym2_qty")
    private float CornNetSlsQtyCYM2;

    @Id
    @Column(name = "corn_net_sls_cym3_qty")
    private float CornNetSlsQtyCYM3;

    @Id
    @Column(name = "corn_total_sls_cy_qty")
    private float CornTotalSlsQtyCY;

    @Id
    @Column(name = "corn_total_sls_cym1_qty")
    private float CornTotalSlsQtyCYM1;

    @Id
    @Column(name = "corn_total_sls_cym2_qty")
    private float CornTotalSlsQtyCYM2;

    @Id
    @Column(name = "corn_total_sls_cym3_qty")
    private float CornTotalSlsQtyCYM3;


    // Soy Columns

    @Id
    @Column(name = "soy_fsa_area_cy")
    private float SoyFSAAreaCY;

    @Id
    @Column(name = "soy_fsa_area_cym1")
    private float SoyFSAAreaCYM1;

    @Id
    @Column(name = "soy_fsa_area_cym2")
    private float SoyFSAAreaCYM2;

    @Id
    @Column(name = "soy_fsa_area_cym3")
    private float SoyFSAAreaCYM3;

    @Id
    @Column(name = "soy_mon_area_cy")
    private float SoyMonsantoAreaCY;

    @Id
    @Column(name = "soy_mon_area_cym1")
    private float SoyMonsantoAreaCYM1;

    @Id
    @Column(name = "soy_mon_area_cym2")
    private float SoyMonsantoAreaCYM2;

    @Id
    @Column(name = "soy_mon_area_cym3")
    private float SoyMonsantoAreaCYM3;

    @Id
    @Column(name = "soy_net_sls_cy_qty")
    private float SoyNetSlsQtyCY;

    @Id
    @Column(name = "soy_net_sls_cym1_qty")
    private float SoyNetSlsQtyCYM1;

    @Id
    @Column(name = "soy_net_sls_cym2_qty")
    private float SoyNetSlsQtyCYM2;

    @Id
    @Column(name = "soy_net_sls_cym3_qty")
    private float SoyNetSlsQtyCYM3;

    @Id
    @Column(name = "soy_total_sls_cy_qty")
    private float SoyTotalSlsQtyCY;

    @Id
    @Column(name = "soy_total_sls_cym1_qty")
    private float SoyTotalSlsQtyCYM1;

    @Id
    @Column(name = "soy_total_sls_cym2_qty")
    private float SoyTotalSlsQtyCYM2;

    @Id
    @Column(name = "soy_total_sls_cym3_qty")
    private float SoyTotalSlsQtyCYM3;

    // Getters and Setters

    public String getCountryCd() {

        return CountryCd;
    }

    public void setCountryCd(String countryCd) {

        CountryCd = countryCd;
    }

    public String getSAPId() {

        return SAPId;
    }

    public void setSAPId(String SAPId) {

        this.SAPId = SAPId;
    }

    public String getFiscalYr() {

        return FiscalYr;
    }

    public void setFiscalYr(String fiscalYr) {

        this.FiscalYr = fiscalYr;
    }

    public float getTotalAreaQty() {

        return TotalAreaQty;
    }

    public void setTotalAreaQty(float totalAreaQty) {

        this.TotalAreaQty = totalAreaQty;
    }

    public float getMonsantoAreaQty() {

        return MonsantoAreaQty;
    }

    public void setMonsantoAreaQty(float monsantoAreaQty) {

        this.MonsantoAreaQty = monsantoAreaQty;
    }

    public float getOpportunityAreaQty() {

        return OpportunityAreaQty;
    }

    public void setOpportunityAreaQty(float opportunityAreaQty) {

        this.OpportunityAreaQty = opportunityAreaQty;
    }

    public String getAreaUOM() {

        return AreaUOM;
    }

    public void setAreaUOM(String AreaUOM) {

        this.AreaUOM = AreaUOM;
    }

    public float getMonsantoLandSharePct() {

        return MonsantoLandSharePct;
    }

    public void setMonsantoLandSharePct(float monsantoLandSharePct) {

        this.MonsantoLandSharePct = monsantoLandSharePct;
    }

    public float getSlsFcstTotalBudget() {

        return SlsFcstTotalBudget;
    }

    public void setSlsFcstTotalBudget(float slsFcstTotalBudget) {

        this.SlsFcstTotalBudget = slsFcstTotalBudget;
    }

    public float getCornFSAAreaCY() {

        return CornFSAAreaCY;
    }

    public void setCornFSAAreaCY(float CornFSAAreaCY) {

        this.CornFSAAreaCY = CornFSAAreaCY;
    }

    public float getCornFSAAreaCYM1() {

        return CornFSAAreaCYM1;
    }

    public void setCornFSAAreaCYM1(float CornFSAAreaCYM1) {

        this.CornFSAAreaCYM1 = CornFSAAreaCYM1;
    }

    public float getCornFSAAreaCYM2() {

        return CornFSAAreaCYM2;
    }

    public void setCornFSAAreaCYM2(float CornFSAAreaCYM2) {

        this.CornFSAAreaCYM2 = CornFSAAreaCYM2;
    }

    public float getCornFSAAreaCYM3() {

        return CornFSAAreaCYM3;
    }

    public void setCornFSAAreaCYM3(float CornFSAAreaCYM3) {

        this.CornFSAAreaCYM3 = CornFSAAreaCYM3;
    }

    public float getCornMonsantoAreaCY() {

        return CornMonsantoAreaCY;
    }

    public void setCornMonsantoAreaCY(float CornMonsantoAreaCY) {

        this.CornMonsantoAreaCY = CornMonsantoAreaCY;
    }

    public float getCornMonsantoAreaCYM1() {

        return CornMonsantoAreaCYM1;
    }

    public void setCornMonsantoAreaCYM1(float CornMonsantoAreaCYM1) {

        this.CornMonsantoAreaCYM1 = CornMonsantoAreaCYM1;
    }

    public float getCornMonsantoAreaCYM2() {

        return CornMonsantoAreaCYM2;
    }

    public void setCornMonsantoAreaCYM2(float CornMonsantoAreaCYM2) {

        this.CornMonsantoAreaCYM2 = CornMonsantoAreaCYM2;
    }

    public float getCornMonsantoAreaCYM3() {

        return CornMonsantoAreaCYM3;
    }

    public void setCornMonsantoAreaCYM3(float CornMonsantoAreaCYM3) {

        this.CornMonsantoAreaCYM3 = CornMonsantoAreaCYM3;
    }

    public float getCornNetSlsQtyCY() {

        return CornNetSlsQtyCY;
    }

    public void setCornNetSlsQtyCY(float CornNetSlsQtyCY) {

        this.CornNetSlsQtyCY = CornNetSlsQtyCY;
    }

    public float getCornNetSlsQtyCYM1() {

        return CornNetSlsQtyCYM1;
    }

    public void setCornNetSlsQtyCYM1(float CornNetSlsQtyCYM1) {

        this.CornNetSlsQtyCYM1 = CornNetSlsQtyCYM1;
    }

    public float getCornNetSlsQtyCYM2() {

        return CornNetSlsQtyCYM2;
    }

    public void setCornNetSlsQtyCYM2(float cornNetSlsQtyCYM2) {

        this.CornNetSlsQtyCYM2 = cornNetSlsQtyCYM2;
    }

    public float getCornNetSlsQtyCYM3() {

        return CornNetSlsQtyCYM3;
    }

    public void setCornNetSlsQtyCYM3(float cornNetSlsQtyCYM3) {

        this.CornNetSlsQtyCYM3 = cornNetSlsQtyCYM3;
    }

    public float getCornTotalSlsQtyCY() {

        return CornTotalSlsQtyCY;
    }

    public void setCornTotalSlsQtyCY(float CornTotalSlsQtyCY) {

        this.CornTotalSlsQtyCY = CornTotalSlsQtyCY;
    }

    public float getCornTotalSlsQtyCYM1() {

        return CornTotalSlsQtyCYM1;
    }

    public void setCornTotalSlsQtyCYM1(float CornTotalSlsQtyCYM1) {

        this.CornTotalSlsQtyCYM1 = CornTotalSlsQtyCYM1;
    }

    public float getCornTotalSlsQtyCYM2() {

        return CornTotalSlsQtyCYM2;
    }

    public void setCornTotalSlsQtyCYM2(float cornTotalSlsQtyCYM2) {

        this.CornTotalSlsQtyCYM2 = cornTotalSlsQtyCYM2;
    }

    public float getCornTotalSlsQtyCYM3() {

        return CornTotalSlsQtyCYM3;
    }

    public void setCornTotalSlsQtyCYM3(float cornTotalSlsQtyCYM3) {

        this.CornTotalSlsQtyCYM3 = cornTotalSlsQtyCYM3;
    }

    public float getSoyFSAAreaCY() {

        return SoyFSAAreaCY;
    }

    public void setSoyFSAAreaCY(float SoyFSAAreaCY) {

        this.SoyFSAAreaCY = SoyFSAAreaCY;
    }

    public float getSoyFSAAreaCYM1() {

        return SoyFSAAreaCYM1;
    }

    public void setSoyFSAAreaCYM1(float SoyFSAAreaCYM1) {

        this.SoyFSAAreaCYM1 = SoyFSAAreaCYM1;
    }

    public float getSoyFSAAreaCYM2() {

        return SoyFSAAreaCYM2;
    }

    public void setSoyFSAAreaCYM2(float SoyFSAAreaCYM2) {

        this.SoyFSAAreaCYM2 = SoyFSAAreaCYM2;
    }

    public float getSoyFSAAreaCYM3() {

        return SoyFSAAreaCYM3;
    }

    public void setSoyFSAAreaCYM3(float SoyFSAAreaCYM3) {

        this.SoyFSAAreaCYM3 = SoyFSAAreaCYM3;
    }

    public float getSoyMonsantoAreaCY() {

        return SoyMonsantoAreaCY;
    }

    public void setSoyMonsantoAreaCY(float SoyMonsantoAreaCY) {

        this.SoyMonsantoAreaCY = SoyMonsantoAreaCY;
    }

    public float getSoyMonsantoAreaCYM1() {

        return SoyMonsantoAreaCYM1;
    }

    public void setSoyMonsantoAreaCYM1(float SoyMonsantoAreaCYM1) {

        this.SoyMonsantoAreaCYM1 = SoyMonsantoAreaCYM1;
    }

    public float getSoyMonsantoAreaCYM2() {

        return SoyMonsantoAreaCYM2;
    }

    public void setSoyMonsantoAreaCYM2(float SoyMonsantoAreaCYM2) {

        this.SoyMonsantoAreaCYM2 = SoyMonsantoAreaCYM2;
    }

    public float getSoyMonsantoAreaCYM3() {

        return SoyMonsantoAreaCYM3;
    }

    public void setSoyMonsantoAreaCYM3(float SoyMonsantoAreaCYM3) {

        this.SoyMonsantoAreaCYM3 = SoyMonsantoAreaCYM3;
    }

    public float getSoyNetSlsQtyCY() {

        return SoyNetSlsQtyCY;
    }

    public void setSoyNetSlsQtyCY(float SoyNetSlsQtyCY) {

        this.SoyNetSlsQtyCY = SoyNetSlsQtyCY;
    }

    public float getSoyNetSlsQtyCYM1() {

        return SoyNetSlsQtyCYM1;
    }

    public void setSoyNetSlsQtyCYM1(float SoyNetSlsQtyCYM1) {

        this.SoyNetSlsQtyCYM1 = SoyNetSlsQtyCYM1;
    }

    public float getSoyNetSlsQtyCYM2() {

        return SoyNetSlsQtyCYM2;
    }

    public void setSoyNetSlsQtyCYM2(float SoyNetSlsQtyCYM2) {

        this.SoyNetSlsQtyCYM2 = SoyNetSlsQtyCYM2;
    }

    public float getSoyNetSlsQtyCYM3() {

        return SoyNetSlsQtyCYM3;
    }

    public void setSoyNetSlsQtyCYM3(float SoyNetSlsQtyCYM3) {

        this.SoyNetSlsQtyCYM3 = SoyNetSlsQtyCYM3;
    }

    public float getSoyTotalSlsQtyCY() {

        return SoyTotalSlsQtyCY;
    }

    public void setSoyTotalSlsQtyCY(float SoyTotalSlsQtyCY) {

        this.SoyTotalSlsQtyCY = SoyTotalSlsQtyCY;
    }

    public float getSoyTotalSlsQtyCYM1() {

        return SoyTotalSlsQtyCYM1;
    }

    public void setSoyTotalSlsQtyCYM1(float SoyTotalSlsQtyCYM1) {

        this.SoyTotalSlsQtyCYM1 = SoyTotalSlsQtyCYM1;
    }

    public float getSoyTotalSlsQtyCYM2() {

        return SoyTotalSlsQtyCYM2;
    }

    public void setSoyTotalSlsQtyCYM2(float SoyTotalSlsQtyCYM2) {

        this.SoyTotalSlsQtyCYM2 = SoyTotalSlsQtyCYM2;
    }

    public float getSoyTotalSlsQtyCYM3() {

        return SoyTotalSlsQtyCYM3;
    }

    public void setSoyTotalSlsQtyCYM3(float SoyTotalSlsQtyCYM3) {

        this.SoyTotalSlsQtyCYM3 = SoyTotalSlsQtyCYM3;
    }
}
