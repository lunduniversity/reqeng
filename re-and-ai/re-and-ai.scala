//> using dep "taggy:taggy:1.0.1,url=https://github.com/bjornregnell/taggy/releases/download/v1.0.1/taggy_3-1.0.1.jar"
//> using scala "3.6.3"

//  run this command in terminal to create slides in target/out.pdf 
//  scala-cli run .

import taggy.*

def and = "\\&"
def nl = "~\\\\{}"

@main def run = slides.toPdf(out = "re-and-ai-bjorn-regnell")

def slides = document(s"Requirements Engineering (RE) and \\\\Artificial Intelligence (AI)", author = "Björn Regnell"):

  frame(s"Requirements Engineering $and Artificial Intelligence"):
    itemize:
      p(s"Long history of research and practice on RE and AI.\\pause")
      p("Recent Large Language Models changes everything")
      itemize: 
        p("new opportunities") 
        p("new challenges \\pause")

    image("../img/linguistic-IEEE-SW-2005.png", width = 0.9)
    p("IEEE Software, 2005")

  frame("AI4RE versus RE4AI"):
    itemize:
      p("**AI4RE** = use of AI to support the RE process.")
      p("**RE4AI** = special RE for AI-based systems.")
    
    p("\\pause\\vspace{2em} **Prompt engineering** can be viewed as a special form of requirements engineering...")


  frame("AI4RE -- some examples"):
    itemize:
      p("**Elicitation:** generate new ideas based on user feedback")
      p("**Specification:** generate feature specs from goals with domain knowledge as context")
      p("**Validation:** check and improve specs, detect ambiguity")
      p("**Selection:** automatic classification, detect dependencies")

  frame("RE4AI -- some examples"):
    itemize:
      p("Requirements on **training data**: quality, bias")
      p("Requirements on **model training**: performance, capacity")
      p("Requirements on **model application**: accuracy, relevance, explainability, probability of hallucination, ...")
      p("Requirements **imposed by regulation**: EU AI Act, GDPR, alignment to human values")

  frame("Development without AI"):
    image("../img/sketch/no-AI-dev.jpg", width = 1.1)
    p("Humans do RE to transform intentions into products.")

  frame("Development with AI support"):
    image("../img/sketch/AI-dev.jpg", width = 1.1)
    p("Humans with AI support do RE to transform intentions into products.")

  frame("Development by AI"):
    image("../img/sketch/AI-as-dev.jpg", width = 1.1)
    p("AI does RE to transform intentions into products.")
    p("What is the role of the human developer?")

  frame("AI everywhere"):
    image("../img/sketch/AI-everywhere.jpg", width = 1.1)
    p("AI does AI training, drives compiler tool chains, and includes AI in products based on AI platforms.")



  frame(""):
    image("../img/tertiary-AI4RE-refsq-2024.png", width = 0.9)
    p("REFSQ 2024")

  frame(""):
    image("../img/generative-AI4RE-arxiv-2024.png", width = 0.85)

  frame(""):
    image("../img/advancing-AI4RE-arxiv-2023.png", width = 0.85)

  frame(""):
    image("../img/systematic-AI4RE-IEEE-Access-2024.png", width = 0.95)
    p("IEEE Access 2024")

  frame(""):
    image("../img/challenges-AI4RE-design-sci-2024.png", width = 0.75)
    p("Design Science 2024")

  frame(""):
    image("../img/systematic-RE4AI-REJ-2024.png", width = 1.08)
    p("Requriements Engineering Journal 2024")

  frame(""):
    image("../img/systematic-RE4AI-IST-2023.png", width = 1.08)
    p("Information and Software Technology 2023")

  frame(""):
    image("../img/RE4ML-REJ-2024.png", width = 1.05)
    p("Requriements Engineering Journal 2024")


    