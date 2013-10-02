/*
 * JOGRE (Java Online Gaming Real-time Engine) - Triangulum
 * Copyright (C) 2004 - 2007-2008  Richard Walter (rwalter42@yahoo.com)
 * http://jogre.sourceforge.org
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA  02111-1307, USA.
 */
package org.jogre.triangulum.client;

import org.jogre.triangulum.common.TriangulumModel;

/**
 * Test model for the Triangulum game.
 *
 * This test model provides access to protected variables that aren't used by
 * the regular game to allow for more complete testing.
 *
 * @author  Richard Walter
 * @version Beta 0.3
 */
public class TriangulumTestModel extends TriangulumModel {

	public TriangulumTestModel (int flavor, int numPlayers) {
		super (flavor, numPlayers);
	}

	/**
	 * Provide access to protected variables
	 */

	public boolean firstMove () {
		return firstMove;
	}

	public int tilesToGo () {
		return tilesToGo;
	}

}

