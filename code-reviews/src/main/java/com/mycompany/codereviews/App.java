package com.mycompany.codereviews;

import java.util.*;

enum ObjectTypeEnum {

    IS("is"),
    PF("pf"),
    UNKNOWN("unknown");

    private final String name;

    ObjectTypeEnum(String name) {
        this.name = name;
    }
}

enum BlueprintKind {
    CHARACT,
    INTEGRATION,
    PUB
}

public class App {

    private static Map<ObjectTypeEnum, Set<BlueprintKind>> acceptedBlueprintMapping = new HashMap<ObjectTypeEnum, Set<BlueprintKind>>() {
        {
            put(ObjectTypeEnum.IS, new HashSet<BlueprintKind>() {
                {
                    add(BlueprintKind.CHARACT);
                    add(BlueprintKind.INTEGRATION);
                }
            });
            put(ObjectTypeEnum.PF, new HashSet<BlueprintKind>() {
                {
                    add(BlueprintKind.PUB);
                }
            });

        }
    };


    public static void main(String[] args) {

        System.out.println(acceptedBlueprintMapping.get(ObjectTypeEnum.IS));
        if (acceptedBlueprintMapping.get(ObjectTypeEnum.IS).contains(BlueprintKind.CHARACT)) {
            System.out.println("good job");
        } else {
            System.out.println("bad luck");
        }

        if (acceptedBlueprintMapping.get(ObjectTypeEnum.IS).contains(BlueprintKind.PUB)) {
            System.out.println("good job");
        } else {
            System.out.println("bad luck");
        }


    }
}
