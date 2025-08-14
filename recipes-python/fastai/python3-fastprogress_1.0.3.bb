# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)

SUMMARY = "A nested progress with plotting options for fastai"
HOMEPAGE = "https://github.com/fastai/fastprogress"
# NOTE: License in setup.py/PKGINFO is: Apache Software License 2.0
# WARNING: the following LICENSE and LIC_FILES_CHKSUM values are best guesses - it is
# your responsibility to verify that the values are complete and correct.
#
# The following license files were not able to be identified and are
# represented as "Unknown" below, you will need to check them yourself:
#   LICENSE
LICENSE = "Apache 2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d35d01d179adb319b5122d416ceed980"

SRC_URI[sha256sum] = "7a17d2b438890f838c048eefce32c4ded47197ecc8ea042cecc33d3deb8022f5"

inherit pypi setuptools3

# WARNING: the following rdepends are determined through basic analysis of the
# python sources, and might not be 100% accurate.
RDEPENDS:${PN} += "python3-core python3-ipython python3-matplotlib"

# WARNING: We were unable to map the following python package/module
# dependencies to the bitbake packages which include them:
#    google
#    nbdev

PYPI_PACKAGE = "fastprogress"
