/*
 * Hello Minecraft! Server Manager.
 * Copyright (C) 2013  huangyuhui
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see {http://www.gnu.org/licenses/}.
 */
package org.jackhuang.hellominecraft.svrmgr.install.cauldron;

/**
 *
 * @author huangyuhui
 */
public class ForgeVersion {

    public String vername, ver, mcver, releasetime, changelog;
    public String[] installer, javadoc, src, universal, userdev;
    public int typeint;

    @Override
    public String toString() {
        return "ForgeVersion{" + "vername=" + vername + ", ver=" + ver + ", mcver=" + mcver + ", releasetime=" + releasetime + ", changelog=" + changelog + ", installer=" + installer + ", javadoc=" + javadoc + ", src=" + src + ", universal=" + universal + ", userdev=" + userdev + ", typeint=" + typeint + '}';
    }
}
