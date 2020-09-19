#!/usr/bin/env bash

# Keep the order as followed one may depend on previous one
declare -a MODULE_ARRAY=('polyfill-matrix' 'polyfill-gradle' 'polyfill-arsc' 'polyfill-manifest' 'polyfill-agp' 'polyfill')
for module in "${MODULE_ARRAY[@]}"
do
./gradlew -PpolyfillPublish="$module" :polyfill:clean :"$module":bintrayUpload
done

./gradlew aggregateJars