/*
    exercise 20.8
 */
public class Pair<F,S> {
    F f;
    S s;

    public Pair(F f, S s)
    {
        this.f = f;
        this.s = s;
    }
    public F getF()
    {
        return f;
    }

    public S getS()
    {
        return s;
    }

    public void setF(F f)
    {
        this.f = f;
    }

    public void setS(S s)
    {
        this.s = s;
    }
}
