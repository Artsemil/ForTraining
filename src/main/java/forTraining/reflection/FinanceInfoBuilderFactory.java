package forTraining.reflection;

import java.lang.annotation.Annotation;

import forTraining.reflection.annotations.FinanceAnnotation;

@FinanceAnnotation(financeBuilder = "WebFinanceInfoBuilder")
public class FinanceInfoBuilderFactory {

    private static final String BUILDER_CLASS = "builder.class";

    public static FinanceInfoBuilder getFinanceInfoBuilder() {

        try {
            Annotation ann = FinanceInfoBuilderFactory.class.getAnnotation(FinanceAnnotation.class);
            FinanceAnnotation fa = (FinanceAnnotation) ann;
            Class cl = Class.forName(fa.financeBuilder());
            FinanceInfoBuilder builder = (FinanceInfoBuilder) cl.newInstance();
            return builder;
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e) {
            e.printStackTrace();
        }
        return null;
    }
}
