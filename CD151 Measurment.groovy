setImageType('BRIGHTFIELD_H_DAB');
setColorDeconvolutionStains('{"Name" : "H-DAB estimated", "Stain 1" : "Hematoxylin", "Values 1" : "0.59694 0.66544 0.44817", "Stain 2" : "DAB", "Values 2" : "0.25513 0.49091 0.83302", "Background" : " 253 249 250"}');
selectAnnotations();
addPixelClassifierMeasurements("CD151-pixel classifier", "CD151-pixel classifier")
selectAnnotations();
runPlugin('qupath.lib.algorithms.IntensityFeaturesPlugin', '{"pixelSizeMicrons":0.25,"region":"ROI","tileSizeMicrons":25.0,"colorOD":false,"colorStain1":false,"colorStain2":true,"colorStain3":false,"colorRed":false,"colorGreen":false,"colorBlue":false,"colorHue":false,"colorSaturation":false,"colorBrightness":false,"doMean":true,"doStdDev":false,"doMinMax":false,"doMedian":false,"doHaralick":false,"haralickDistance":1,"haralickBins":32}')
