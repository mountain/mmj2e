//*****************************************************************************/
//* Copyright (C) 2005-2013                                                   */
//* MEL O'CAT  X178G243 (at) yahoo (dot) com                                  */
//* License terms: GNU General Public License Version 2                       */
//*                or any later version                                       */
//*****************************************************************************/
//*456789012345678 (80-character line to adjust editor window) 456789012345678*/

/*
 * {{file}}.java  0.01 20/09/2012
 *
 * Version 0.01:
 * Aug-09-2013: new from decompilation.
 */

package mmj.search;

public class SearchResultsFieldAttr {

    public SearchResultsFieldAttr(final int i, final String s, final String s1,
        final int j, final String s2)
    {
        fieldId = i;
        label = s;
        toolTip = s1;
        columns = j;
        defaultText = s2;
    }

    public final int fieldId;
    public final String label;
    public final String toolTip;
    public final int columns;
    public final String defaultText;
}
