# BMZ QuPath DAB Quantification

This repository contains QuPath Groovy scripts used for basement membrane zone (BMZ)–focused
DAB intensity quantification in immunohistochemistry (IHC) images.

## Description
The scripts were developed for quantitative analysis of hemidesmosomal protein expression
(CD151, dystonin, plectin) in human oral tissues, focusing on the basement membrane zone
and adjacent basal epithelial layers.

## Software requirements
- QuPath v0.5.1 or later
- Brightfield H-DAB stained whole-slide images

## Scripts
- `CD151_Measurement.groovy`
-  DST_Measurement.groovy
-  PLEC_Measurement.groovy
  Performs pixel-based DAB intensity measurement within manually annotated BMZ regions,
  using estimated H-DAB stain vectors and standardized intensity feature extraction.

## Usage
1. Open image in QuPath
2. Annotate BMZ regions manually
3. Load and run the Groovy script from the QuPath Script Editor
4. Export measurements for downstream statistical analysis

