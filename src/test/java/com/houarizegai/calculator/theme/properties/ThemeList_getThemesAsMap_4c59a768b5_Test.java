// ********RoostGPT********
/*
Test generated by RoostGPT for test privateMethodsJava using AI Type Open AI and AI Model gpt-4

1. Test Scenario: Validate that the getThemesAsMap() method returns a non-null Map object when the themes list is not empty.
   Description: This test scenario is to validate that the getThemesAsMap() method correctly converts the list of themes into a Map object and returns a non-null Map object when the themes list is not empty.

2. Test Scenario: Validate that the getThemesAsMap() method returns an empty Map when the themes list is empty.
   Description: This test scenario is to validate that the getThemesAsMap() method correctly handles the case where the list of themes is empty and returns an empty Map.

3. Test Scenario: Validate that the getThemesAsMap() method correctly maps theme names to corresponding Theme objects.
   Description: This test scenario is to validate that the getThemesAsMap() method correctly converts the list of themes into a Map object, with theme names as keys and corresponding Theme objects as values.

4. Test Scenario: Validate that the getThemesAsMap() method correctly handles duplicate theme names in the themes list.
   Description: This test scenario is to validate that the getThemesAsMap() method correctly handles the case where there are duplicate theme names in the themes list. In this case, the last occurrence of the duplicate theme should be in the resulting Map.

5. Test Scenario: Validate that the getThemesAsMap() method throws a NullPointerException when the themes list is null.
   Description: This test scenario is to validate that the getThemesAsMap() method throws a NullPointerException when the themes list is null. This is based on the assumption that the method does not handle null inputs.

6. Test Scenario: Validate that the getThemesAsMap() method correctly handles theme names with leading/trailing white spaces.
   Description: This test scenario is to validate that the getThemesAsMap() method correctly handles theme names with leading/trailing white spaces in the themes list. The resulting Map should have trimmed keys.

7. Test Scenario: Validate that the getThemesAsMap() method correctly handles theme names that are case sensitive.
   Description: This test scenario is to validate that the getThemesAsMap() method correctly handles theme names that are case sensitive. The resulting Map should have case sensitive keys.
*/

// ********RoostGPT********
package com.houarizegai.calculator.theme.properties;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ThemeList_getThemesAsMap_4c59a768b5_Test {
    
    private ThemeList themeList;
    
    @BeforeEach
    public void setUp() {
        themeList = new ThemeList();
    }
    
    @Test
    public void getThemesAsMap_ThemesNotEmpty_NonNullMapReturned() {
        List<Theme> themes = new ArrayList<>();
        Theme theme = new Theme();
        theme.setName("Dark");
        themes.add(theme);
        themeList.setThemes(themes);
        Map<String, Theme> themeMap = themeList.getThemesAsMap();
        
        assertNotNull(themeMap);
        assertEquals(1, themeMap.size());
    }
    
    @Test
    public void getThemesAsMap_ThemesEmpty_EmptyMapReturned() {
        themeList.setThemes(new ArrayList<>());
        Map<String, Theme> themeMap = themeList.getThemesAsMap();
        
        assertNotNull(themeMap);
        assertTrue(themeMap.isEmpty());
    }
    
    @Test
    public void getThemesAsMap_CorrectMapping() {
        List<Theme> themes = new ArrayList<>();
        Theme theme = new Theme();
        theme.setName("Light");
        themes.add(theme);
        themeList.setThemes(themes);
        Map<String, Theme> themeMap = themeList.getThemesAsMap();
        
        assertTrue(themeMap.containsKey("Light"));
        assertEquals(theme, themeMap.get("Light"));
    }
    
    @Test
    public void getThemesAsMap_DuplicateThemeNames_LastOccurrenceInMap() {
        List<Theme> themes = new ArrayList<>();
        Theme theme1 = new Theme();
        theme1.setName("Theme1");
        themes.add(theme1);
        Theme theme2 = new Theme();
        theme2.setName("Theme1");
        themes.add(theme2);
        themeList.setThemes(themes);
        Map<String, Theme> themeMap = themeList.getThemesAsMap();
        
        assertEquals(1, themeMap.size());
        assertEquals(theme2, themeMap.get("Theme1"));
    }
    
    @Test
    public void getThemesAsMap_ThemesNull_NullPointerExceptionThrown() {
        assertThrows(NullPointerException.class, () -> themeList.getThemesAsMap());
    }
    
    @Test
    public void getThemesAsMap_ThemeNamesWithWhiteSpaces_TrimmedKeysInMap() {
        List<Theme> themes = new ArrayList<>();
        Theme theme = new Theme();
        theme.setName(" Theme ");
        themes.add(theme);
        themeList.setThemes(themes);
        Map<String, Theme> themeMap = themeList.getThemesAsMap();
        
        assertTrue(themeMap.containsKey("Theme"));
    }
    
    @Test
    public void getThemesAsMap_CaseSensitiveThemeNames_CaseSensitiveKeysInMap() {
        List<Theme> themes = new ArrayList<>();
        Theme theme = new Theme();
        theme.setName("Theme");
        themes.add(theme);
        themeList.setThemes(themes);
        Map<String, Theme> themeMap = themeList.getThemesAsMap();
        
        assertTrue(themeMap.containsKey("Theme"));
        assertFalse(themeMap.containsKey("theme"));
    }
}
