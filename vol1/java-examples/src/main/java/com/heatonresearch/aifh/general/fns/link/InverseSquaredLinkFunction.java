package com.heatonresearch.aifh.general.fns.link;

import com.heatonresearch.aifh.AIFHError;
import com.heatonresearch.aifh.general.fns.Fn;

/**
 * The inverse squared link function for a GLM.
 * <p/>
 * http://en.wikipedia.org/wiki/Generalized_linear_model
 */
public class InverseSquaredLinkFunction implements Fn {

    /**
     * {@inheritDoc}
     */
    @Override
    public double evaluate(final double[] x) {
        if (x.length > 1) {
            throw new AIFHError("The inverse squared link function can only accept one parameter.");
        }

        return -Math.pow(x[0], -2);
    }

}