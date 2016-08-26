package com.insights.repositories;

import com.insights.models.DealerRADL;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.*;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

public interface DealerRADLRepository extends Repository<DealerRADL, Long> {

    @Transactional(readOnly = true)
    @Query(value = "select dr from DealerRADL dr where SAPId = :SAPId",
            nativeQuery = true
    )
    public DealerRADL findBySapId(String SAPId);

    @Transactional(readOnly = true)
    @Query("select SAPId from DealerRADL dr where dr.SAPId is not null AND " +

            "UPPER(dr.CountryCd) LIKE UPPER(CONCAT('%', :CountryCd, '%')) AND " +
            "UPPER(dr.SAPId) LIKE UPPER(CONCAT('%', :SAPId, '%')) AND " +
            "UPPER(dr.FiscalYr) LIKE UPPER(CONCAT('%', :FiscalYr, '%')) AND " +

            "dr.TotalAreaQty LIKE CONCAT('%', :TotalAreaQty, '%') AND  " +
            "dr.MonsantoAreaQty LIKE CONCAT('%', :MonsantoAreaQty, '%') AND " +
            "dr.OpportunityAreaQty LIKE CONCAT('%', :OpportunityAreaQty, '%') AND " +
            "UPPER(dr.AreaUOM) LIKE UPPER(CONCAT('%', :AreaUOM, '%')) AND " +
            "dr.MonsantoLandSharePct LIKE CONCAT('%', :MonsantoLandSharePct, '%') AND " +
            "dr.SlsFcstTotalBudget LIKE CONCAT('%', :SlsFcstTotalBudget, '%') AND " +

            "dr.CornFSAAreaCY LIKE CONCAT('%', :CornFSAAreaCY, '%') AND " +
            "dr.CornFSAAreaCYM1 LIKE CONCAT('%', :CornFSAAreaCYM1, '%') AND " +
            "dr.CornFSAAreaCYM2 LIKE CONCAT('%', :CornFSAAreaCYM2, '%') AND " +
            "dr.CornFSAAreaCYM3 LIKE CONCAT('%', :CornFSAAreaCYM3, '%') AND " +
            "dr.CornMonsantoAreaCY LIKE CONCAT('%', :CornMonsantoAreaCY, '%') AND " +
            "dr.CornMonsantoAreaCYM1 LIKE CONCAT('%', :CornMonsantoAreaCYM1, '%') AND " +
            "dr.CornMonsantoAreaCYM2 LIKE CONCAT('%', :CornMonsantoAreaCYM2, '%') AND " +
            "dr.CornMonsantoAreaCYM3 LIKE CONCAT('%', :CornMonsantoAreaCYM3, '%') AND " +
            "dr.CornNetSlsQtyCY LIKE CONCAT('%', :CornNetSlsQtyCY, '%') AND " +
            "dr.CornNetSlsQtyCYM1 LIKE CONCAT('%', :CornNetSlsQtyCYM1, '%') AND " +
            "dr.CornNetSlsQtyCYM2 LIKE CONCAT('%', :CornNetSlsQtyCYM2, '%') AND " +
            "dr.CornNetSlsQtyCYM3 LIKE CONCAT('%', :CornNetSlsQtyCYM3, '%') AND " +
            "dr.CornTotalSlsQtyCY LIKE CONCAT('%', :CornTotalSlsQtyCY, '%') AND " +
            "dr.CornTotalSlsQtyCYM1 LIKE CONCAT('%', :CornTotalSlsQtyCYM1, '%') AND " +
            "dr.CornTotalSlsQtyCYM2 LIKE CONCAT('%', :CornTotalSlsQtyCYM2, '%') AND " +
            "dr.CornTotalSlsQtyCYM3 LIKE CONCAT('%', :CornTotalSlsQtyCYM3, '%') AND " +

            "dr.SoyFSAAreaCY LIKE CONCAT('%', :SoyFSAAreaCY, '%') AND " +
            "dr.SoyFSAAreaCYM1 LIKE CONCAT('%', :SoyFSAAreaCYM1, '%') AND " +
            "dr.SoyFSAAreaCYM2 LIKE CONCAT('%', :SoyFSAAreaCYM2, '%') AND " +
            "dr.SoyFSAAreaCYM3 LIKE CONCAT('%', :SoyFSAAreaCYM3, '%') AND " +
            "dr.SoyMonsantoAreaCY LIKE CONCAT('%', :SoyMonsantoAreaCY, '%') AND " +
            "dr.SoyMonsantoAreaCYM1 LIKE CONCAT('%', :SoyMonsantoAreaCYM1, '%') AND " +
            "dr.SoyMonsantoAreaCYM2 LIKE CONCAT('%', :SoyMonsantoAreaCYM2, '%') AND " +
            "dr.SoyMonsantoAreaCYM3 LIKE CONCAT('%', :SoyMonsantoAreaCYM3, '%') AND " +
            "dr.SoyNetSlsQtyCY LIKE CONCAT('%', :SoyNetSlsQtyCY, '%') AND " +
            "dr.SoyNetSlsQtyCYM1 LIKE CONCAT('%', :SoyNetSlsQtyCYM1, '%') AND " +
            "dr.SoyNetSlsQtyCYM2 LIKE CONCAT('%', :SoyNetSlsQtyCYM2, '%') AND " +
            "dr.SoyNetSlsQtyCYM3 LIKE CONCAT('%', :SoyNetSlsQtyCYM3, '%') AND " +
            "dr.SoyTotalSlsQtyCY LIKE CONCAT('%', :SoyTotalSlsQtyCY, '%') AND " +
            "dr.SoyTotalSlsQtyCYM1 LIKE CONCAT('%', :SoyTotalSlsQtyCYM1, '%') AND " +
            "dr.SoyTotalSlsQtyCYM2 LIKE CONCAT('%', :SoyTotalSlsQtyCYM2, '%') AND " +
            "dr.SoyTotalSlsQtyCYM3 LIKE CONCAT('%', :SoyTotalSlsQtyCYM3, '%') ")


    public Page<DealerRADL> findBySearchTerm(String CountryCd, String SAPId, String FiscalYr, float TotalAreaQty,
                                             float MonsantoAreaQty, float OpportunityAreaQty, String AreaUOM,
                                             float monsantoLandSharePct, float slsFcstTotalBudget, float cornFSAAreaCY, float cornFSAAreaCYM1, float cornFSAAreaCYM2, float cornFSAAreaCYM3, float cornMonsantoAreaCY, float cornMonsantoAreaCYM1, float cornMonsantoAreaCYM2, float MonsantoLandSharePct, float SlsFcstTotalBudget,
                                             float CornFSAAreaCY, float CornFSAAreaCYM1, float CornFSAAreaCYM2, float CornFSAAreaCYM3,
                                             float CornMonsantoAreaCY, float CornMonsantoAreaCYM1, float CornMonsantoAreaCYM2, float CornMosantoAreaCYM3,
                                             float CornNetSlsQtyCY, float CornNetSlsQtyCYM1, float CornNetSlsQtyCYM2, float CornNetSlsQtyCYM3,
                                             float CornTotalSlsQtyCY, float CornTotalSlsQtyCYM1, float CornTotalSlsQtyCYM2, float CornTotalSlsQtyCYM3,
                                             float SoyNetSlsQtyCYM1, float SoyNetSlsQtyCYM2, float SoyNetSlsQtyCYM3,
                                             float SoyTotalSlsQtyCY, float SoyTotalSlsQtyCYM1, float SoyTotalSlsQtyCYM2, float SoyTotalSlsQtyCYM3,
                                             Pageable pageable);
    }



