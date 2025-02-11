//> using dep "taggy:taggy:1.0.1,url=https://github.com/bjornregnell/taggy/releases/download/v1.0.1/taggy_3-1.0.1.jar"
//> using scala "3.6.3"

//  run this command in terminal to create slides in target/out.pdf 
//  scala-cli run .

import taggy.*

def and = "\\&"
def nl = "~\\\\{}"

@main def run = slides.toPdf(out = "ai-inside-bjorn-regnell")

def slides = document(s"Requirements Engineering (RE) and \\\\Artificial Intelligence (AI)", author = "Björn Regnell"):
  frame("Requirements Engineering and Artificial Intelligence"):
    p("There is a long history of research on RE and AI, but the recent break-through of large language models (LLMs) changes the scene of what is possible and what is challenging.")
    itemize:
      p("AI4RE: support from AI to do RE. Some examples:")
      itemize:
        p("**Elicitation:** generate new ideas based on user feedback")
        p("**Specification:** generate feature specs from goals with domain knowledge as context")
        p("**Validation:** check and improve specs, detect ambiguity")
        p("**Selection:** automatic classification, detect dependencies")
      p("RE4AI: special RE for AI systems. Some examples:")
      itemize:
        p("Requirements on **training data**: quality, bias")
        p("Requirements on **model training**: performance, capacity")
        p("Requirements on **model application**: accuracy, relevance, explainability, probability of hallucination, ...")
        p("Requirements **imposed by regulation**: EU AI Act, GDPR, alignment to human values")

    p("**Prompt engineering** is a kind of requirements engineering...")

