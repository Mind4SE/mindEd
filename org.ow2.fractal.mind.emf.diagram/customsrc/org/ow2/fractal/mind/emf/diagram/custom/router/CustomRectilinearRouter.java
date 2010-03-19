package org.ow2.fractal.mind.emf.diagram.custom.router;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.LayoutManager;
import org.eclipse.draw2d.PositionConstants;
import org.eclipse.gmf.runtime.draw2d.ui.figures.IBorderItemLocator;
import org.eclipse.gmf.runtime.draw2d.ui.internal.routers.BorderItemRectilinearRouter;


@SuppressWarnings("restriction")
public class CustomRectilinearRouter extends BorderItemRectilinearRouter {

	/**
     * Returns the position of the border item with respect to its parent
     * Clients can override this method to change the way postions is
     * calculated for border items
     * @param borderFigure  Figure to use to get the position
     * @return  the border item position, see <code>PositionConstants</code>
     */
    protected int getBorderFigurePosition(IFigure borderFigure) {
        IFigure child = borderFigure;
        IFigure parent = borderFigure.getParent();
        if (parent != null && parent.getLayoutManager() != null) {
            LayoutManager layoutManager = parent.getLayoutManager();
            Object layoutConstraint = layoutManager.getConstraint(child);
            if (layoutConstraint instanceof IBorderItemLocator) {
                return ((IBorderItemLocator) layoutConstraint)
                    .getCurrentSideOfParent();
            }
        }
        return PositionConstants.NONE;
    }
   
}