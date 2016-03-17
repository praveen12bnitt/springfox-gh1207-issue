/*
 * Copyright &#169; 2015 Manhattan Associates, Inc.  All Rights Reserved.
 *
 * Confidential, Proprietary and Trade Secrets Notice
 *
 * Use of this software is governed by a license agreement. This software
 * contains confidential, proprietary and trade secret information of
 * Manhattan Associates, Inc. and is protected under United States and
 * international copyright and other intellectual property laws. Use, disclosure,
 * reproduction, modification, distribution, or storage in a retrieval system in
 * any form or by any means is prohibited without the prior express written
 * permission of Manhattan Associates, Inc.
 *
 * Manhattan Associates, Inc.
 * 2300 Windy Ridge Parkway, 10th Floor
 * Atlanta, GA 30339 USA
 */

package com.github.prajan.controller;

import com.github.prajan.dto.UniversityDTO;
import io.swagger.annotations.*;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Generated;

@Generated(value = "Generated once by EntityFramework")
@RestController
@RequestMapping("/api/sample")
@Api(tags="University Services",produces = "application/json")
public class UniversityController
{

    @RequestMapping(value = "/university/{pk}", produces = { MediaType.APPLICATION_JSON_VALUE }, method = RequestMethod.GET)
    @ApiOperation(value = "Get University by PK", notes = "Get University based on PK.")
    @ApiResponses(value = { @ApiResponse(code = 404, message = "University not found") })
    public UniversityDTO getUniversity(
            @ApiParam(value = "university PK", required = true) @PathVariable String pk,
            @ApiParam(value = "Response Template Name", required = false) @RequestParam(required = false) String templateName)
    {
        return new UniversityDTO();
    }

    @RequestMapping(value = "/university", method = RequestMethod.POST)
    @ApiOperation(value = "Create University", notes = "Create University.")
    @ApiResponses(value = { @ApiResponse(code = 400, message = "Request contained data that was invalid"),
            @ApiResponse(code = 200, message = "University Created")})
    public UniversityDTO createUniversity(
            @ApiParam(name="UniversityData") @RequestBody UniversityDTO universityDTO,
            @ApiParam(value = "Response Template", required = false) @RequestParam(required = false) String templateName)
    {
        return new UniversityDTO();
    }

}
