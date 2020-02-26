package cost;

public class ConstructionCost {

    private static final int standardMaterial = 1200;
    private static final int mediumStandardMaterial = 1500;
    private static final int highStandardMaterial = 1800;
    private static final int highMaterialCostWithAutomation = 2500;

    private static String[] materials = new String[]{"Standard Material", "Above Standard Material", "High Standard Material"};

    public static double calculateCost(String selectedMaterial, double area, boolean requireAutomation )
    {
        if (area == 0)
            throw new RuntimeException();
        
        else if(selectedMaterial.equalsIgnoreCase(materials[0])) {
            double ans=area*standardMaterial;
            return ans;
        }

        else if(selectedMaterial.equalsIgnoreCase(materials[1]))
        {
            double ans=area*mediumStandardMaterial;
            return ans;
        }

        else if (selectedMaterial.equalsIgnoreCase(materials[2]))
        {
            double ans;
            if (requireAutomation)
                ans=area*highMaterialCostWithAutomation;
            else
                ans=area*highStandardMaterial;
            return ans;
        }
        else
            throw new RuntimeException();

    }

    public static String[] getMaterials() {
        return materials;
    }

}

