// Chapter 10, Programming Challenge 4: Essay class

public class Essay extends GradedActivity
{
   private double grammar;       // Points for grammar
   private double spelling;      // Points for spelling
   private double correctLength; // Points for length 
   private double content;       // Points for content

   // The setScore method sets points for grammar, spelling, length, and content.
   // This method overloads the super class method. Note that the other "set" methods
   // are private. Those methods are for validating points before they are assigned.
   public void setScore(double gr, double sp, double len, double cnt)
   {
      // Set the individual scores
      setGrammar(gr);
      setSpelling(sp);
      setCorrectLength(len);
      setContent(cnt);
      
      // Set the total score
      super.setScore(grammar + spelling + correctLength + content);
   }

   // The setGrammar method sets the  grammar points, 
   // validating them before they are set.
   private void setGrammar(double g)
   {
      if (g <= 30.0)
         grammar = g;
      else // Invalid points
         grammar = 0.0;
   }

   // The setSpelling method sets the spelling points, 
   // validating them before they are set.
   private void setSpelling(double s)
   {
      if (s <= 20.0)
         spelling = s;
      else // Invalid points
         spelling = 0.0;
   }

   // The setCorrectLength method sets the points for correct length, 
   // validating them before they are set.
   private void setCorrectLength(double c)
   {
      if (c <= 20.0)
         correctLength = c;
      else // Invalid points
         correctLength = 0.0;
   }

   // The setContent method sets the points for content, 
   // validating them before they are set.
   private void setContent(double c)
   {
      if (c <= 30)
         content = c;
      else // Invalid points
         content = 0.0;
   }

   // The getGrammar method returns the points awarded for grammar.
   public double getGrammar()
   {
      return grammar;
   }

   // The getSpelling method returns the points awarded for spelling.
   public double getSpelling()
   {
      return spelling;
   }

   // The getCorrectLength method returns the points awarded for correct length.
   public double getCorrectLength()
   {
      return correctLength;
   }

   // The getContent method returns the points awarded for content.
   public double getContent()
   {
      return content;
   }

   // The getScore method returns the overall numeric score. 
   // Overrides the base class method.
   public double getScore()
   {
      return grammar + spelling + correctLength + content;
   }
}