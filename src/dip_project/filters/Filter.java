/*===========================================================================
COPYRIGHT 2013 Vinícius G. Mendonça ALL RIGHTS RESERVED.

This software cannot be copied, stored, distributed without
Vinícius G. Mendonça prior authorization.

This file was made available on https://github.com/ViniGodoy and it
is free to be redistributed or used under Creative Commons license 2.5 br:
http://creativecommons.org/licenses/by-sa/2.5/br/
============================================================================*/
package dip_project.filters;

import java.awt.image.BufferedImage;

public interface Filter {
    BufferedImage process(BufferedImage source);

    void addListener(FilterListener listener);

    void removeListner(FilterListener listener);
}
