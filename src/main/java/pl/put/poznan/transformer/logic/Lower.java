package pl.put.poznan.transformer.logic;

public class Lower extends SizeModifier{
    private String text;
    public Lower(TextTransformer TT){
        this.text = TT.getText();
        //place for transformation
    }
    @Override
    public String getText(){

        return this.text;
    }

}
