//> using dep "taggy:taggy:1.0.1,url=https://github.com/bjornregnell/taggy/releases/download/v1.0.1/taggy_3-1.0.1.jar"
//> using scala "3.6.3"

//  run this command in terminal to create slides in target/out.pdf 
//  scala-cli run .

import taggy.*

def and = "\\&"
def nl = "~\\\\{}"

@main def run = slides.toPdf(out = "re-and-ai")

def slides = document(s"AI4RE $and RE4AI", author = "Björn Regnell"):
  frame(s"Requirements Engineering $and Artificial Intelligence"):
    itemize:
      p("AI can help with RE. Examples:")
      itemize:
        p("Elicitation: generate new ideas based on user feedback")
        p("Specification: generate specifications based on context")
        p("Validation: check and improve language quality")
        p("Selection: automatic classification")
      p("RE for AI systems")
      itemize:
        p("Requirements on training data")
        p("Requirements on AI model application")
        p("Requirements imposed by regulation")

