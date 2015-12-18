/*
 * Copyright (c) 2015.  The AppCan Open Source Project.
 *
 *  This program is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU Lesser General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *
 *  This program is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU Lesser General Public License for more details.
 *
 *  You should have received a copy of the GNU Lesser General Public License
 *  along with this program.  If not, see <http://www.gnu.org/licenses/>.
 *
 *
 */

package org.zywx.wbpalmstar.plugin.uexxunfei.vo;

import java.io.Serializable;

/**
 * Created by ylt on 15/12/17.
 */
public class InitSpeakerInputVO implements Serializable {

    /**
     * 设置发音人
     */
    public String voiceName="xiaoyan";

    /**
     * 设置语速
     */
    public String speed="50";

    /**
     * 设置音量，范围0~100
     */
    public String volume="80";

}
