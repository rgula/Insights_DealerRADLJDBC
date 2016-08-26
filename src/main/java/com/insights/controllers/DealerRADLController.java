package com.insights.controllers;

import com.insights.models.*;
import com.insights.repositories.*;
import io.swagger.annotations.*;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.annotations.ApiIgnore;
import org.springframework.web.bind.annotation.ResponseStatus;

@RestController
public class DealerRADLController {

    private final Log log = LogFactory.getLog(this.getClass());

    DealerRADLController() {}

    @Autowired
    private DealerRADLRepository DealerRADLRepository;

    public DealerRADLController(DealerRADLRepository DealerRADLRepository) {
        this.DealerRADLRepository = DealerRADLRepository;
    }

    @ApiOperation(value = "Find by SAP_ID")
    @RequestMapping(value = "/queries/{SAPId}", method = RequestMethod.POST) @ResponseBody
    DealerRADL postWithSAPId(
            @PathVariable(value = "SAPId") String SAPId) {
        return DealerRADLRepository.findBySapId(SAPId);
    }



    @RequestMapping(value = "/DealerRADL/search", method = RequestMethod.POST) @ResponseBody
    public Page<DealerRADL> searchAllFields(
            @RequestParam(value = "SAPId", defaultValue = "") String SAPId,
            @RequestParam(value = "CountryCd", defaultValue = "", required = false) String CountryCd,
            @RequestParam(value = "FiscalYr", defaultValue = "", required = false) String FiscalYr,

            @RequestParam(value = "TotalAreaQty", defaultValue = "", required = false) float TotalAreaQty,
            @RequestParam(value = "MonsantoAreaQty", defaultValue = "", required = false) float MonsantoAreaQty,
            @RequestParam(value = "OpportunityAreaQty", defaultValue = "", required = false) float OpportunityAreaQty,
            @RequestParam(value = "AreaUOM", defaultValue = "", required = false) String AreaUOM,
            @RequestParam(value = "MonsantoLandSharePct", defaultValue = "", required = false) float MonsantoLandSharePct,
            @RequestParam(value = "SlsFcstTotalBudget", defaultValue = "", required = false) float SlsFcstTotalBudget,

            @RequestParam(value = "CornFSAAreaCY", defaultValue = "", required = false) float CornFSAAreaCY,
            @RequestParam(value = "CornFSAAreaCYM1", defaultValue = "", required = false) float CornFSAAreaCYM1,
            @RequestParam(value = "CornFSAAreaCYM2", defaultValue = "", required = false) float CornFSAAreaCYM2,
            @RequestParam(value = "CornFSAAreaCYM3", defaultValue = "", required = false) float CornFSAAreaCYM3,
            @RequestParam(value = "CornMonsantoAreaCY", defaultValue = "", required = false) float CornMonsantoAreaCY,
            @RequestParam(value = "CornMonsantoAreaCYM1", defaultValue = "", required = false) float CornMonsantoAreaCYM1,
            @RequestParam(value = "CornMonsantoAreaCYM2", defaultValue = "", required = false) float CornMonsantoAreaCYM2,
            @RequestParam(value = "CornMonsantoAreaCYM3", defaultValue = "", required = false) float CornMonsantoAreaCYM3,
            @RequestParam(value = "CornNetSlsQtyCY", defaultValue = "", required = false) float CornNetSlsQtyCY,
            @RequestParam(value = "CornNetSlsQtyCYM1", defaultValue = "", required = false) float CornNetSlsQtyCYM1,
            @RequestParam(value = "CornNetSlsQtyCYM2", defaultValue = "", required = false) float CornNetSlsQtyCYM2,
            @RequestParam(value = "CornNetSlsQtyCYM3", defaultValue = "", required = false) float CornNetSlsQtyCYM3,
            @RequestParam(value = "CornTotalSlsQtyCY", defaultValue = "", required = false) float CornTotalSlsQtyCY,
            @RequestParam(value = "CornTotalSlsQtyCYM1", defaultValue = "", required = false) float CornTotalSlsQtyCYM1,
            @RequestParam(value = "CornTotalSlsQtyCYM2", defaultValue = "", required = false) float CornTotalSlsQtyCYM2,
            @RequestParam(value = "CornTotalSlsQtyCYM3", defaultValue = "", required = false) float CornTotalSlsQtyCYM3,

            @RequestParam(value = "SoyFSAAreaCY", defaultValue = "", required = false) float SoyFSAAreaCY,
            @RequestParam(value = "SoyFSAAreaCYM1", defaultValue = "", required = false) float SoyFSAAreaCYM1,
            @RequestParam(value = "SoyFSAAreaCYM2", defaultValue = "", required = false) float SoyFSAAreaCYM2,
            @RequestParam(value = "SoyFSAAreaCYM3", defaultValue = "", required = false) float SoyFSAAreaCYM3,
            @RequestParam(value = "SoyMonsantoAreaCY", defaultValue = "", required = false) float SoyMonsantoAreaCY,
            @RequestParam(value = "SoyMonsantoAreaCYM1", defaultValue = "", required = false) float SoyMonsantoAreaCYM1,
            @RequestParam(value = "SoyMonsantoAreaCYM2", defaultValue = "", required = false) float SoyMonsantoAreaCYM2,
            @RequestParam(value = "SoyMonsantoAreaCYM3", defaultValue = "", required = false) float SoyMonsantoAreaCYM3,
            @RequestParam(value = "SoyNetSlsQtyCY", defaultValue = "", required = false) float SoyNetSlsQtyCY,
            @RequestParam(value = "SoyNetSlsQtyCYM1", defaultValue = "", required = false) float SoyNetSlsQtyCYM1,
            @RequestParam(value = "SoyNetSlsQtyCYM2", defaultValue = "", required = false) float SoyNetSlsQtyCYM2,
            @RequestParam(value = "SoyNetSlsQtyCYM3", defaultValue = "", required = false) float SoyNetSlsQtyCYM3,
            @RequestParam(value = "SoyTotalSlsQtyCY", defaultValue = "", required = false) float SoyTotalSlsQtyCY,
            @RequestParam(value = "SoyTotalSlsQtyCYM1", defaultValue = "", required = false) float SoyTotalSlsQtyCYM1,
            @RequestParam(value = "SoyTotalSlsQtyCYM2", defaultValue = "", required = false) float SoyTotalSlsQtyCYM2,
            @RequestParam(value = "SoyTotalSlsQtyCYM3", defaultValue = "", required = false) float SoyTotalSlsQtyCYM3,

            @ApiIgnore final Pageable pageable) {

        return DealerRADLRepository.findBySearchTerm(
                SAPId, CountryCd, FiscalYr, TotalAreaQty,
                MonsantoAreaQty, OpportunityAreaQty, AreaUOM,
                MonsantoLandSharePct, SlsFcstTotalBudget,
                CornFSAAreaCY, CornFSAAreaCYM1, CornFSAAreaCYM2, CornFSAAreaCYM3,
                CornMonsantoAreaCY, CornMonsantoAreaCYM1, CornMonsantoAreaCYM2, CornMonsantoAreaCYM3,
                CornNetSlsQtyCY,CornNetSlsQtyCYM1, CornNetSlsQtyCYM2, CornNetSlsQtyCYM3,
                CornTotalSlsQtyCY, CornTotalSlsQtyCYM1, CornTotalSlsQtyCYM2, CornTotalSlsQtyCYM3,
                SoyFSAAreaCY, SoyFSAAreaCYM1, SoyFSAAreaCYM2, SoyFSAAreaCYM3,
                SoyMonsantoAreaCY, SoyMonsantoAreaCYM1, SoyMonsantoAreaCYM2, SoyMonsantoAreaCYM3,
                SoyNetSlsQtyCY, SoyNetSlsQtyCYM1, SoyNetSlsQtyCYM2, SoyNetSlsQtyCYM3,
                SoyTotalSlsQtyCY, SoyTotalSlsQtyCYM1, SoyTotalSlsQtyCYM2, SoyTotalSlsQtyCYM3,
                pageable);


    }

}
