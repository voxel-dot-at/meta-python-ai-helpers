# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)

SUMMARY = "Legacy registered functions for spaCy backwards compatibility"
HOMEPAGE = "https://spacy.io"
# NOTE: License in setup.py/PKGINFO is: MIT
# WARNING: the following LICENSE and LIC_FILES_CHKSUM values are best guesses - it is
# your responsibility to verify that the values are complete and correct.
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=3417e0d77f2bc48923350e7f18fefe20"

SRC_URI[sha256sum] = "b37d6e0c9b6e1d7ca1cf5bc7152ab64a4c4671f59c85adaf7a3fcb870357a774"

inherit pypi setuptools3

# WARNING: the following rdepends are determined through basic analysis of the
# python sources, and might not be 100% accurate.
RDEPENDS:${PN} += "python3-core python3-math"

# WARNING: We were unable to map the following python package/module
# dependencies to the bitbake packages which include them:
#    pytest
#    spacy
#    spacy.attrs
#    spacy.compat
#    spacy.errors
#    spacy.kb
#    spacy.lang.en
#    spacy.language
#    spacy.ml
#    spacy.pipeline.pipe
#    spacy.pipeline.trainable_pipe
#    spacy.scorer
#    spacy.tests
#    spacy.tokens
#    spacy.training
#    spacy.util
#    spacy.vocab
#    srsly
#    thinc.api
#    thinc.initializers
#    thinc.types
#    thinc.util
#    tqdm
#    wandb
#    wasabi

PYPI_PACKAGE = "spacy-legacy"
