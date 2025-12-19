%!TEX encoding = UTF-8 Unicode

%https://sv.sharelatex.com/blog/2011/03/27/how-to-write-a-latex-class-file-and-design-your-own-cv.html

\NeedsTeXFormat{LaTeX2e}
\ProvidesClass{program}[2015/08/14 Document class based on article]
\LoadClass[10pt,a4paper]{article}

%\special{papersize=297mm,210mm}
\usepackage[landscape,twocolumn,margin={2cm,2cm}]{geometry}
\setlength{\columnsep}{16mm}

\usepackage[utf8]{inputenc}
\usepackage[T1]{fontenc}
%\usepackage{PTSans}
\usepackage{tgtermes} %times
\usepackage{tgheros} %helvetica
\usepackage{sectsty} %change font on headings
\allsectionsfont{\sffamily}

\usepackage{multirow}
\usepackage[hidelinks]{hyperref}
\usepackage{enumitem}
\usepackage{graphicx}
\usepackage{pdfpages}
\usepackage{rotating}
\usepackage{adjustbox}
\usepackage{epstopdf}
