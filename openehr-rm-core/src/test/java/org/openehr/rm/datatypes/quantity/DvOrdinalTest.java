package org.openehr.rm.datatypes.quantity;

import org.openehr.rm.datatypes.text.CodePhrase;
import org.openehr.rm.datatypes.text.DvCodedText;

import junit.framework.TestCase;

public class DvOrdinalTest extends TestCase {
	
	/**
     * Tests creating a dvOrdinal with negative value
     *
     * @throws Exception
     */
    public void testCreateDvOrdinalWithNegativeValue() {
        CodePhrase definingCode = new CodePhrase("test", "123");
        DvCodedText coded = new DvCodedText("coded text", definingCode);        
        
        try {
        	new DvOrdinal(-1, coded);
        	
        } catch (IllegalArgumentException e) {
        	fail("failed to create dvOrdinal with negative value");
        }
    } 
}
