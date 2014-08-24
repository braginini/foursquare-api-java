/*
 * FoursquareAPI - Foursquare API for Java
 * Copyright (C) 2008 - 2011 Antti Leppä / Foyt
 * http://www.foyt.fi
 * 
 * License: 
 * 
 * Licensed under GNU Lesser General Public License Version 3 or later (the "LGPL")
 * http://www.gnu.org/licenses/lgpl.html
 */

package fi.foyt.foursquare.api.entities;

import fi.foyt.foursquare.api.FoursquareEntity;

/**
 * Class representing CompleteSpecial entity
 * 
 * @see <a href="https://developer.foursquare.com/docs/responses/special.html" target="_blank">https://developer.foursquare.com/docs/responses/special.html</a>
 * 
 * @author Antti Leppä
 */
public class Specials implements FoursquareEntity {
  
  /**
   * Returns count of specials
   * 
   * @return count of items specials
   */
  public Integer getCount() {
    return count;
  }

  /**
   * Returns array of specials
   *
   * @return array of specials {@link fi.foyt.foursquare.api.entities.CompleteSpecial}
   */
  public CompleteSpecial[] getItems() {
    return items;
  }


    private Integer count;
    private CompleteSpecial[] items;
}
