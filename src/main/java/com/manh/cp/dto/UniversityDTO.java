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

package com.manh.cp.dto;

import com.manh.cp.dto.UniversityBaseDTO;
import io.swagger.annotations.ApiModel;

import javax.annotation.Generated;

@Generated(value = "Generated once by EntityFramework")
@ApiModel(value="University")
public class UniversityDTO extends UniversityBaseDTO
{

    public UniversityDTO()
    {
        super();
    }

    public UniversityDTO(UniversityBaseDTO.KeyDTO key)
    {
        super(key);
    }


    /**
     * If fields are added to this subclass, they should be included in this
     * toString() method.
     *
     * @return String representation of object
     */
    @Override
    public String toString()
    {
        return super.toString();
    }
}
